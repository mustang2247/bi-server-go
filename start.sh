#!/bin/bash

app=bi-server

echo "拉取代码"
git pull

echo "删除 bi-server"
rm -rf $app

echo "编译 bi-server"
make linux

echo $app
ID=$(ps aux | grep $app | grep -v 'grep'| awk '{print $2}')

echo $ID
for pid in $ID
do
  kill -9 $pid
  echo "killed $pid success"
done

./$app &

if [ $? -eq 0 ];then
  echo "start java nohup success!"
else
  echo "start faild"
fi

