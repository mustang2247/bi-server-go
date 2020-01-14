package main

import (
	"bi-server/src/app"
	"github.com/donnie4w/go-logger/logger"
)

func main() {
	logger.SetLevel(logger.INFO)
	//logger.SetLevel(logger.DEBUG)

	logger.Info("starling server")

	// initial application
	app := app.NewApp()

	defer app.Destory()

	logger.Info(app.Launch())

	logger.Info("starling server end")

}
