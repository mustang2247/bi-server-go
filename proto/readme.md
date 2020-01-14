## bi server
  主要用於存儲用戶數據，數據收集和查詢等


## protobuf 文件處理
    ./protoc --java_out=./src/main/java --plugin=protoc-gen-grpc-java --grpc-java_out=./src/main/java ./*.proto

在此文件目录下执行2个命令

第一个命令是为了生成GreeterGrpc.java文件
第二个命令是生成实体类信息
第一个命令A

    ./protoc --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java --grpc-java_out=../java/ --proto_path=./ ./*.proto
    ./protoc --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java --grpc-java_out=./ --proto_path=./ ./*.proto

    --plugin=protoc-gen-grpc-java的值是刚刚安装的protoc-gen-grpc-java编译完成生成的插件目录
    --grpc-java_out值为GreeterGrpc.java生成目录
    --proto_path值为proto文件目录，记好mac下 ./后面需要加一个空格

第二个命令B
    ./protoc --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java --grpc-java_out=./java/ --java_out=./java/ ./*.proto

    ./protoc --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java --grpc-java_out=./ --java_out=./ --js_out=import_style=commonjs:. --grpc-web_out=import_style=commonjs,mode=grpcwebtext:. --proto_path=./ ./*.proto
    

## golang proto 文件處理 protoc-gen
    ./protoc --go_out=. ./*.proto
    
    ./protoc --go_out=./go/ ./*.proto
    
    ./protoc --go_out=plugins=grpc:./go/ ./*.proto