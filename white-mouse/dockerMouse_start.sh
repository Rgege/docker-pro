appname="$1"
javaOPTS="$2"

echo "====================start docker container:["${appname}"]===================="
#/usr/bin/docker run -d -p 8001:8001 --name $appname $appname
/usr/bin/docker run -d -e JAVA_OPTS=$javaOPTS -p 8001:8001 --name $appname $appname
#删除none镜像
/usr/bin/docker rmi $(docker images -f "dangling=true" -q)
