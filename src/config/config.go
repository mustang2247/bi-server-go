package config

import (
	"fmt"
	"github.com/BurntSushi/toml"
	"os"
	"path/filepath"
	"sync"
)

// blog server config
// use: config.Config() return *ServerConfig  single instance
var (
	cfg   *ServerConfig
	sOnce sync.Once
	lock  = &sync.RWMutex{}
)

//应用服务器配置
type ServerConfig struct {
	ServerName        string      `toml:"server_name"`
	LogEnable         bool        `toml:"log_enable"`
	LogPath           string      `toml:"log_path"`
	ImgPath           string      `toml:"img_path"`
	ServerPort        int         `toml:"server_port"`
	ServerRpcPort     int      	  `toml:"server_rpc_port"`
	EnvProd           bool        `toml:"environment_prod"`
	SecretKey         string      `toml:"secret_key"`
	DefaultClientUser string      `toml:"default_client_user"`
	DBCfg             DBConfig    `toml:"database"`
	RedisCfg          RedisConfig `toml:"redis"`
}

//数据库配置
type DBConfig struct {
	Dtype    string `toml:"db_type"`
	Name     string `toml:"db_name"`
	Addr     string `toml:"db_addr"`
	Port     string `toml:"db_port"`
	User     string `toml:"db_user"`
	Password string `toml:"db_password"`
	Debug    bool   `toml:"db_debug"`
}

//Redis配置
type RedisConfig struct {
	Host string `toml:"r_host"`
	Port string `toml:"r_port"`
}

//return single config instance
func Config() *ServerConfig {
	sOnce.Do(decodeConfig)
	lock.RLock()
	defer lock.RUnlock()
	return cfg
}

//decode config with toml file
func decodeConfig() {
	path := os.Getenv("APP_CONFIG_PATH")
	if len(path) <= 0 {
		path = "./config/config_debug.toml"
	}
	fp, err := filepath.Abs(path)
	if err != nil {
		panic(fmt.Errorf(" Read Config Path Err: %s", fp))
	}
	config := new(ServerConfig)
	if _, err := toml.DecodeFile(fp, config); err != nil {
		panic(fmt.Errorf("DecodeFile Config  Err:  %s", err.Error()))
	}
	lock.Lock()
	cfg = config
	lock.Unlock()
}
