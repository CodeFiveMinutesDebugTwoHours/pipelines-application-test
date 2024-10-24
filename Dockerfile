FROM registry.access.redhat.com/ubi8/openjdk-17:1.20-2.1729094551
WORKDIR /work
COPY build/quarkus-app /work/quarkus-app
ENV TZ=Asia/Shanghai
EXPOSE 10000
ENTRYPOINT ["java","-jar","quarkus-app/quarkus-run.jar"]
