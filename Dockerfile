# 拉取的基础镜像
FROM openjdk:11

# 作者
MAINTAINER Rex Joush

# 设置容器挂在的卷
VOLUME /tmp
# 添加镜像到
ADD GraduationAlbumSpringBoot.jar app.jar
RUN bash -c 'touch /app.war'

# 添加 endpoint
ENTRYPOINT ["java","-jar","/app.jar"]