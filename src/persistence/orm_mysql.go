package persistence

import (
	"bi-server/src/config"
	"github.com/donnie4w/go-logger/logger"
	_ "github.com/go-sql-driver/mysql"
	"github.com/jinzhu/gorm"
)

// 持久化 之 gorm mysql
var orm *gorm.DB

// 数据库编码格式
const db_CharSet string = "?charset=utf8&parseTime=true&loc=Asia%2FShanghai"

// 根据配置初始化 gorm 打开数据库连接
func InitialMysql() {
	logger.Info("初始化数据库 starling ")
	conf := config.Config().DBCfg
	var err error

	urli := conf.User + ":" + conf.Password + "@tcp(" + conf.Addr + ":" + conf.Port + ")/" + conf.Name + db_CharSet

	logger.Info(urli)
	orm, err = gorm.Open(conf.Dtype, urli)

	if err != nil {
		logger.Info("连接数据库失败", err)
		panic(err)
	}
	orm.SingularTable(true)
	orm.LogMode(conf.Debug)
	logger.Info("初始化数据库成功")
}

// 获取 gorm 全局实例
func GetOrm() *gorm.DB {
	return orm
}
