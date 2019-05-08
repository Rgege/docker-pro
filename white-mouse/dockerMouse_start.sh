appname="$1"
#javaOPTS="-Xms512m -Xmx512m -Djava.rmi.server.hostname=211.149.142.55 -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.rmi.port=8999 -Dcom.sun.management.jmxremote.port=8999 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"

echo "====================start docker container:["${appname}"]===================="
#-v /opt/app/log/dkmouse:/opt/app/log/dkmouse
#--link mysql5.7:dkMysql 容器之间互相连接 时间设置-v /etc/localtime:/etc/localtime:ro -v /etc/timezone:/etc/timezone:ro
/usr/bin/docker run -d -p 127.0.0.1:7210:8001 -p 8999:8999 --link mysql5.7:dkMysql -v /etc/localtime:/etc/localtime:ro --name $appname $appname
#/usr/bin/docker run -d -e JAVA_OPTS=$javaOPTS -p 8001:8001 --name $appname $appname
#删除none镜像
/usr/bin/docker rmi $(docker images -f "dangling=true" -q)
#给容器内的日志路径跟宿主机之间建立软连接
echo y | rm /opt/app/log/dkmouse
ln -s $(docker inspect -f {{.GraphDriver.Data.MergedDir}} ${appname})/opt/app/log/dkmouse/ /opt/app/log


