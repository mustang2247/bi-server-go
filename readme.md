
## 环境变量
    # 通过环境变量GOPROXY设置代理
    export GOPROXY=https://goproxy.cn
    
    # go mod功能开关，默认是auto，在gopath中不启用
    # 可设置为on强制启用
    export GO111MODULE=on
    
## 初始化 go mod init

## 6. 构建执行文件
```
make windows
make linux
make mac
```
or

```
go generate
```
