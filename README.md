# Notifications

Microservices multi project based on [this tutorial](https://developer.okta.com/blog/2019/05/22/java-microservices-spring-boot-spring-cloud) (with some changes)

## Build it

```
http https://start.spring.io/starter.zip bootVersion==2.4.0 javaVersion==11 \
  artifactId==discovery-service name==eureka-service \
  dependencies==cloud-eureka-server baseDir==discovery-service | tar -xzvf -

http https://start.spring.io/starter.zip bootVersion==2.4.0 \
  artifactId==notification-service name==notification-service baseDir==notification-service \
  dependencies==actuator,cloud-eureka,data-jpa,h2,data-rest,web,devtools,lombok | tar -xzvf

# Because Hystrix is not supported
http https://start.spring.io/starter.zip bootVersion==2.3.6 \
  artifactId==api-gateway name==api-gateway baseDir==api-gateway \
  dependencies==cloud-eureka,cloud-feign,data-rest,web,cloud-hystrix,lombok | tar -xzvf -
```
