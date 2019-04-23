appname="$1"
javaOPTS="-Xms512m -Xmx512m -Djava.rmi.server.hostname=211.149.142.55 -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.rmi.port=8999 -Dcom.sun.management.jmxremote.port=8999 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false"

echo "====================start docker container:["${appname}"]===================="
#/usr/bin/docker run -d -p 8001:8001 --name $appname $appname
/usr/bin/docker run -d -e JAVA_OPTS=$javaOPTS -p 8001:8001 --name $appname $appname
#删除none镜像
/usr/bin/docker rmi $(docker images -f "dangling=true" -q)

echo "====================映射端口===================="
/usr/bin/docker -p 8999:8999
