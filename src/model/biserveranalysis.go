package model

import (
	"time"
)

// BiEvent 统计玩家自定义事件
type BiEvent struct {
	ID         int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid      string    `gorm:"column:appid;type:varchar(64);not null"`    // 应用id
	Who        string    `gorm:"column:who;type:varchar(64);not null"`      // 用户id
	What       string    `gorm:"column:what;type:varchar(32);not null"`     // 自定义事件的名称
	Deviceid   string    `gorm:"column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime time.Time `gorm:"-"`          // 创建时间
	Updatetime time.Time `gorm:"-"`          // 更新时间
	Serverid   string    `gorm:"column:serverid;type:varchar(64)"`          // 服务器ID
	Channelid  string    `gorm:"column:channelid;type:varchar(64)"`         // 渠道ID
	Define1    string    `gorm:"column:define1;type:varchar(128)"`          // 用户自定义
	Define2    string    `gorm:"column:define2;type:varchar(128)"`          // 用户自定义
	ClientV    string    `gorm:"column:client_v;type:varchar(8)"`           // 前端版本
}

// BiHeartbeat 统计玩家在线
type BiHeartbeat struct {
	ID         int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid      string    `gorm:"column:appid;type:varchar(64);not null"`    // 应用id
	Who        string    `gorm:"column:who;type:varchar(64);not null"`      // 用户id
	Deviceid   string    `gorm:"column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime time.Time `gorm:"-"`          // 创建时间
	Updatetime time.Time `gorm:"-"`          // 更新时间
	Serverid   string    `gorm:"column:serverid;type:varchar(64)"`          // 服务器ID
	Channelid  string    `gorm:"column:channelid;type:varchar(64)"`         // 渠道ID
	Level      string    `gorm:"column:level;type:varchar(8)"`              // 账户等级
}

// BiLogin 统计玩家登陆
type BiLogin struct {
	ID         int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid      string    `gorm:"column:appid;type:varchar(64);not null"`          // 应用id
	Who        string    `gorm:"index;column:who;type:varchar(64);not null"`      // 用户id
	Deviceid   string    `gorm:"index;column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime time.Time `gorm:"index;-"`          // 创建时间
	Updatetime time.Time `gorm:"-"`                // 更新时间
	Date       string    `gorm:"column:date;type:date;not null"`                  // 设备日期
	Time       string    `gorm:"column:time;type:time;not null"`                  // 设备时间
	IDfa       string    `gorm:"column:idfa;type:varchar(64)"`                    // 广告标识符
	IDfv       string    `gorm:"column:idfv;type:varchar(64)"`                    // Vindor标示符
	Serverid   string    `gorm:"column:serverid;type:varchar(64)"`                // 服务器ID
	Channelid  string    `gorm:"column:channelid;type:varchar(64)"`               // 渠道ID
	Level      string    `gorm:"column:level;type:varchar(64)"`                   // 账户等级
	ClientV    string    `gorm:"column:client_v;type:varchar(8)"`                 // 前端版本
}

// BiStartup 统计玩家打开应用
type BiStartup struct {
	ID         int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid      string    `gorm:"column:appid;type:varchar(64);not null"`    // 应用id
	Deviceid   string    `gorm:"column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime time.Time `gorm:"index;-"`    // 创建时间
	Updatetime time.Time `gorm:"-"`          // 更新时间
	Date       string    `gorm:"column:date;type:date;not null"`            // 设备日期
	Time       string    `gorm:"column:time;type:time;not null"`            // 设备时间
	IDfa       string    `gorm:"column:idfa;type:varchar(64)"`              // 广告标识符
	IDfv       string    `gorm:"column:idfv;type:varchar(64)"`              // Vindor标示符
	Channelid  string    `gorm:"column:channelid;type:varchar(64)"`         // 渠道ID
	IP         string    `gorm:"column:ip;type:varchar(64)"`                // ip
	Network    string    `gorm:"column:network;type:varchar(64)"`           // 网络制式2G,3G,WIFI
	DeviceType string    `gorm:"column:device_type;type:varchar(64)"`       // 设备类型 机型 iphone4s
	Os         string    `gorm:"column:os;type:varchar(64)"`                // 操作系统 ios7.0
	Op         string    `gorm:"column:op;type:varchar(64)"`                // 运营商
	Resolution string    `gorm:"column:resolution;type:varchar(64)"`        // 分辨率
	ClientV    string    `gorm:"column:client_v;type:varchar(32)"`          // 前端版本
	Extra      string    `gorm:"column:extra;type:varchar(255)"`            // 额外信息
}

// BiEconomy 统计玩家在游戏内虚拟交易
// 经济系统
type BiEconomy struct {
	ID             int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid          string    `gorm:"column:appid;type:varchar(64);not null"`    // 应用id
	Who            string    `gorm:"column:who;type:varchar(64);not null"`      // 用户id
	Deviceid       string    `gorm:"column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime     time.Time `gorm:"-"`          // 创建时间
	Updatetime     time.Time `gorm:"-"`          // 更新时间
	ItemName       string    `gorm:"column:item_name;type:varchar(64)"`         // 游戏内虚拟物品的名称/ID
	ItemAmount     string    `gorm:"column:item_amount;type:varchar(32)"`       // 交易的数量
	ItemTotalprice string    `gorm:"column:item_totalprice;type:varchar(32)"`   // 交易的总价
	Serverid       string    `gorm:"column:serverid;type:varchar(64)"`          // 服务器ID
	Channelid      string    `gorm:"column:channelid;type:varchar(64)"`         // 渠道ID
	Level          string    `gorm:"column:level;type:varchar(8)"`              // 账户等级
	ClientV        string    `gorm:"column:client_v;type:varchar(8)"`           // 前端版本
}

// BiInstall 统计玩家第一次打开应用
// 安装应用
type BiInstall struct {
	ID         int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid      string    `gorm:"unique_index:index_appid_deviceid;column:appid;type:varchar(64);not null"`          // 应用id
	Deviceid   string    `gorm:"unique_index:index_appid_deviceid;index;column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime time.Time `gorm:"-"`                                            // 创建时间
	Updatetime time.Time `gorm:"-"`                                                  // 更新时间
	Date       string    `gorm:"column:date;type:date;not null"`                                                    // 设备日期
	Time       string    `gorm:"column:time;type:time;not null"`                                                    // 设备时间
	IDfa       string    `gorm:"column:idfa;type:varchar(64)"`                                                      // 广告标识符
	IDfv       string    `gorm:"column:idfv;type:varchar(64)"`                                                      // Vindor标示符
	ChannelID  string    `gorm:"column:channel_id;type:varchar(64)"`                                                // 渠道ID
	ClientV    string    `gorm:"column:client_v;type:varchar(8)"`                                                   // 前端版本
}

// BiPayment 统计玩家充值
type BiPayment struct {
	ID                int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid             string    `gorm:"column:appid;type:varchar(64);not null"`               // 应用id
	Who               string    `gorm:"index;column:who;type:varchar(64);not null"`           // 用户id
	Deviceid          string    `gorm:"index;column:deviceid;type:varchar(64);not null"`      // 设备id
	Createtime        time.Time `gorm:"index;-"`               // 创建时间
	Updatetime        time.Time `gorm:"-"`                     // 更新时间
	TransactionID     string    `gorm:"column:transaction_id;type:varchar(64);not null"`      // 交易的流水号
	PaymentType       string    `gorm:"column:payment_type;type:varchar(64);not null"`        // 支付类型，例如支付宝，银联，苹果、谷歌官方等,如果是系统赠送的，paymentType为：free
	CurrencyType      string    `gorm:"column:currency_type;type:varchar(64);not null"`       // 货币类型，按照国际标准组织ISO 4217中规范的3位字母，例如CNY人民币、USD美金等，详情请点击
	CurrencyAmount    string    `gorm:"column:currency_amount;type:varchar(64);not null"`     // 支付的真实货币的金额
	VirtualCoinAmount string    `gorm:"column:virtual_coin_amount;type:varchar(64);not null"` // 通过充值获得的游戏内货币的数量
	IapName           string    `gorm:"column:iap_name;type:varchar(64);not null"`            // 游戏内购买道具的名称
	IapAmount         string    `gorm:"column:iap_amount;type:varchar(64);not null"`          // 游戏内购买道具的数量
	Serverid          string    `gorm:"column:serverid;type:varchar(64)"`                     // 服务器ID
	Channelid         string    `gorm:"column:channelid;type:varchar(64)"`                    // 渠道ID
	IDfa              string    `gorm:"column:idfa;type:varchar(64)"`                         // 广告标识符
	IDfv              string    `gorm:"column:idfv;type:varchar(64)"`                         // Vindor标示符
	Level             string    `gorm:"column:level;type:varchar(64)"`                        // 账户等级
	ClientV           string    `gorm:"column:client_v;type:varchar(8)"`                      // 前端版本
}

// BiQuest .统计玩家的任务/关卡/副本
type BiQuest struct {
	ID          int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid       string    `gorm:"column:appid;type:varchar(64);not null"`        // 应用id
	Who         string    `gorm:"column:who;type:varchar(64);not null"`          // 用户id
	Deviceid    string    `gorm:"column:deviceid;type:varchar(64);not null"`     // 设备id
	Createtime  time.Time `gorm:"-"`              // 创建时间
	Updatetime  time.Time `gorm:"-"`              // 更新时间
	QuestID     string    `gorm:"column:quest_id;type:varchar(64);not null"`     // 当前任务/关卡/副本的编号或名称
	QuestStatus string    `gorm:"column:quest_status;type:varchar(16);not null"` // 当前任务/关卡/副本的状态，有如下三种类型：开始：a完成：c失败：f
	QuestType   string    `gorm:"column:quest_type;type:varchar(16);not null"`   // 当前任务/关卡/副本的类型，例如： 新手任务：new 主线任务：main 支线任务：sub 开发者也可以根据自己游戏的特点自定义类型
	Serverid    string    `gorm:"column:serverid;type:varchar(64)"`              // 服务器ID
	Channelid   string    `gorm:"column:channelid;type:varchar(64)"`             // 渠道ID
	Level       string    `gorm:"column:level;type:varchar(64)"`                 // 账户等级
	ClientV     string    `gorm:"column:client_v;type:varchar(8)"`               // 前端版本
}

// BiRegister 统计玩家账号注册
type BiRegister struct {
	ID          int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Appid       string    `gorm:"column:appid;type:varchar(64);not null"`          // 应用id
	Who         string    `gorm:"column:who;type:varchar(64);not null"`            // 用户id
	Deviceid    string    `gorm:"index;column:deviceid;type:varchar(64);not null"` // 设备id
	Createtime  time.Time `gorm:"index;-"`          // 创建时间
	Updatetime  time.Time `gorm:"-"`                // 更新时间
	IDfa        string    `gorm:"column:idfa;type:varchar(64)"`                    // 广告标识符
	IDfv        string    `gorm:"column:idfv;type:varchar(64)"`                    // Vindor标示符
	AccountType string    `gorm:"column:account_type;type:varchar(64)"`            // 账户类型
	Gender      int       `gorm:"column:gender;type:int(1)"`                       // 账户性别
	Age         string    `gorm:"column:age;type:varchar(8)"`                      // 用户年龄
	Serverid    string    `gorm:"column:serverid;type:varchar(64)"`                // 服务器ID
	Channelid   string    `gorm:"column:channelid;type:varchar(64)"`               // 渠道ID
	ClientV     string    `gorm:"column:client_v;type:varchar(8)"`                 // 前端版本
}

// BiUser 用户基本信息表
type BiUser struct {
	ID              int       `gorm:"primary_key;column:id;type:int(11);not null"`
	Deviceid        string    `gorm:"column:deviceid;type:varchar(64);not null"`      // 设备id
	Appid           string    `gorm:"column:appid;type:varchar(64);not null"`         // 游戏appid
	Userid          string    `gorm:"unique;column:userid;type:varchar(64);not null"` // 玩家用户id
	UserName        string    `gorm:"column:user_name;type:varchar(200)"`             // 玩家数据信息
	UserGold        string    `gorm:"column:user_gold;type:varchar(64)"`              // 金币
	UserDiamond     string    `gorm:"column:user_diamond;type:varchar(64)"`           // 砖石
	UserSex         string    `gorm:"column:user_sex;type:varchar(8)"`                // 性别
	UserLevel       string    `gorm:"column:user_level;type:varchar(64)"`             // 等级
	UserExp         string    `gorm:"column:user_exp;type:varchar(64)"`               // 经验
	UserIsRecharged string    `gorm:"column:userIs_recharged;type:varchar(4)"`        // 是否充值过
	UserVipexp      string    `gorm:"column:user_vipexp;type:varchar(64)"`            // vip经验
	Createtime      time.Time `gorm:"-"`               // 创建时间
	Updatetime      time.Time `gorm:"-"`               // 更新时间
	ClientV         string    `gorm:"column:client_v;type:varchar(8)"`                // 前端版本
}
