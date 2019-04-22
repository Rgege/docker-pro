appname="dkmouse01"
containerName="1"
echo "$containerName"
containerName=$(docker ps -a -q --no-trunc --filter name= $appName)
echo "$containerName"
if [ -z "$containerName" ];
then
    echo "====================当前不存在该容器，直接进行启动该操作===================="
elif [ -n "$containerName" ];
then
    echo "====================当前已存在容器，停止并移除该容器===================="
    /usr/bin/docker stop "$containerName"
    /usr/bin/docker rm "$containerName"
elif [ "$containerName" == "1" ];
then
    echo "====================查询的信息有误，执行默认操作===================="
    /usr/bin/docker stop "$containerName"
    /usr/bin/docker rm "$containerName"
fi
#这里注释掉  应为Jenkins构建命令已经有过一次打包行为  所以注掉
#/usr/lib/dev/maven/apache-maven-3.6.1/bin/mvn clean install -P prd dockerfile:build
/usr/bin/docker run -d -p 8001:8001 --name $appname $appname
