package app

import (
	"bi-server/src/config"
	BiService "bi-server/src/net/grpc"
	"bi-server/src/persistence"
	"github.com/garyburd/redigo/redis"
	"github.com/gin-gonic/gin"
	"github.com/jinzhu/gorm"
)

//博客应用服务器
type App struct {
	DB     *gorm.DB
	RPool  *redis.Pool
	Conf   *config.ServerConfig
	//Server *dotweb.DotWeb
}

func NewApp() *App {
	return &App{}
}

//根据配置文件初始化数据库
func (app *App) initDB() {
	persistence.InitialMysql()
	app.DB = persistence.GetOrm()
}

//根据配置文件初始化Redis
func (app *App) initRedis() {
	persistence.InitialRedis()
	app.RPool = persistence.GetRedisPool()
}


func Start() {
	r := gin.Default()
	r.GET("/ping", func(c *gin.Context) {
		c.JSON(200, gin.H{
			"message": "pong",
		})
	})
	r.Run() // listen and serve on 0.0.0.0:8080 (for windows "localhost:8080")
}

// 启动服务器
func (app *App) Launch() error {
	app.Conf = config.Config()
	app.initDB()
	app.initRedis()
	//app.initServer()
	//app.initRouter()
	//app.initImgServer()
	//app.initApiDocs()

	return BiService.StartRpcServer()
}

// 关闭操作
func (app *App) Destory() {
	if app.DB != nil {
		app.DB.Close()
	}
	if app.RPool != nil {
		app.RPool.Close()
	}
	//if app.Server != nil {
	//	app.Server.Close()
	//}
}
