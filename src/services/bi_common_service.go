package services

import (
	"bi-server/src/common"
	"bi-server/src/model"
	"bi-server/src/persistence"
)

type BiCommonService struct {
	repo *persistence.BaseRepository
}

// 安装 只能报送一次
func (service *BiCommonService) Install(mode *model.BiInstall) common.Err  {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 启动 打开应用
func (service *BiCommonService) StartUp(mode *model.BiStartup) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 注册
func (service *BiCommonService) Register(mode *model.BiRegister) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 登陆
func (service *BiCommonService) Login(mode *model.BiLogin) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 支付
func (service *BiCommonService) Payment(mode *model.BiPayment) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 虚拟交易 经济系统
func (service *BiCommonService) Economy(mode *model.BiEconomy) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 添加用户
func (service *BiCommonService) AddUser(mode *model.BiUser) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 任务及副本系统
func (service *BiCommonService) Quest(mode *model.BiQuest) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 自定义 处理 表等
func (service *BiCommonService) Event(mode *model.BiEvent) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}
// 心跳 在线统计
func (service *BiCommonService) Heartbeat(mode *model.BiHeartbeat) common.Err {
	if err := service.repo.Insert(mode); err != nil {
		return common.ErrInsertDataErr
	}
	return common.Err{Code: common.Ok_Code, Msg: ""}
}