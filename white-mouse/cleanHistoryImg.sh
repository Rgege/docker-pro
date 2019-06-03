imgName="$1"
containerName="$2"
pomSrc="$3"
echo "==============imgName:["${imgName}"] containerName:["${containerName}"] pomSrc:["${pomSrc}"] "
container="1"
img="0"
container=$(docker ps -a -q --no-trunc --filter name=${containerName})
img=$(docker images ${imgName})
if [ -z "$container" ];
then
    echo "====================不存在容器===================="
elif [ -n "$container" ];
then
    echo "====================当前已存在容器，停止并移除该容器===================="
    /usr/bin/docker stop "$container"
    /usr/bin/docker rm "$container"
elif [ "$container" == "1" ];
then
    echo "====================查询的信息有误，执行默认操作===================="
    /usr/bin/docker stop "$container"
    /usr/bin/docker rm "$container"
fi
if [ -z "$img" ];
then
    echo "====================不存在该镜像===================="
elif [ -n "$img" ];
then
    echo "====================存在该镜像  删除===================="
        /usr/bin/docker rmi ${imgName}
elif [ "$img" == "0" ];
then
    echo "====================查询有误 执行默认操作===================="
    /usr/bin/docker rmi ${imgName}
fi
echo "====================mvn-docker build start===================="
cd ${pomSrc}
/usr/lib/dev/maven/apache-maven-3.6.1/bin/mvn clean install -P prd dockerfile:build