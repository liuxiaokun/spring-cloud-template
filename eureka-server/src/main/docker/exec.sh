#!/usr/bin/env bash
#用maven对项目进行打包
mvn clean package
# docker.cloudoer.com/eureka-server是build的镜像名字，后面的点别忘了，路径。
docker build -t docker.cloudoer.com/eureka-server .
#启动镜像，根据不同profile
docker run --name peer1 -e "SPRING_PROFILES_ACTIVE=peer1" --network=fred-net -p 8761:8761 -itd docker.cloudoer.com/eureka-server
docker run --name peer2 -e "SPRING_PROFILES_ACTIVE=peer2" --network=fred-net -p 8762:8762 -itd docker.cloudoer.com/eureka-server