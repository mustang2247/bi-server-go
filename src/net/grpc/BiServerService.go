package BiService

import (
	pb "bi-server/proto/go"
	"bi-server/src/config"
	"bi-server/src/model"
	"bi-server/src/services"
	"context"
	"encoding/json"
	"fmt"
	"github.com/donnie4w/go-logger/logger"
	"google.golang.org/grpc"
	"log"
	"net"
	"strconv"
)

var sRpc *grpc.Server

type server struct {
	pb.UnimplementedBiServiceServer
	// 公共 data orm 服務
	commonService services.BiCommonService
}

// 啟動 RPC 服務器
func StartRpcServer() error {
	return rpcServer()
}
// 重置 RPC 服務器
func ResetRpcServer() error {
	if sRpc != nil {
		sRpc.Stop()
	}
	sRpc = nil
	return rpcServer()
}

func rpcServer() error {
	port := ":" + strconv.Itoa(config.Config().ServerRpcPort)
	logger.Info("啟動 rpc 服務中： ", port)

	lis, err := net.Listen("tcp", port)
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
		return err
	}
	sRpc := grpc.NewServer()
	pb.RegisterBiServiceServer(sRpc, &server{})
	if err := sRpc.Serve(lis); err != nil {
		log.Fatalf("failed to serve: %v", err)
		return err
	}
	logger.Info("啟動 rpc 服務成功： ", port)
	return nil
}

// 安装 只能报送一次
func (s *server) Install(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	install := model.BiInstall{}
	err := json.Unmarshal(str, &install)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Install(&install)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 启动 打开应用
func (s *server) StartUp(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiStartup{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.StartUp(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 注册
func (s *server) Register(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiRegister{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Register(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 登陆
func (s *server) Login(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiLogin{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Login(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 支付
func (s *server) Payment(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiPayment{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Payment(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 虚拟交易 经济系统
func (s *server) Economy(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiEconomy{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Economy(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 添加用户
func (s *server) AddUser(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiUser{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.AddUser(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 任务及副本系统
func (s *server) Quest(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiQuest{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Quest(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 自定义 处理 表等
func (s *server) Event(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiEvent{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Event(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}
// 心跳 在线统计
func (s *server) Heartbeat(ctx context.Context, in *pb.CommonRequest) (*pb.CommonResponse, error)  {
	logger.Info("Received message: ", in.Message)
	str := []byte(in.Message)
	entity := model.BiHeartbeat{}
	err := json.Unmarshal(str, &entity)
	// 解析失败会报错，如json字符串格式不对，缺"号，缺}等。
	if err!=nil{
		fmt.Println(err)
	}

	e := s.commonService.Heartbeat(&entity)
	return &pb.CommonResponse{Code: e.Code, Message: e.Msg, MsgId: -1}, nil
}