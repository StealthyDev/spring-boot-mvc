# spring-boot-mvc

This is a sample project with just a ping controller

# Components
* Gradle
* Spring boot
* Embedded tomcat

# Running the application

Standalone
```
gradle bootRun
```

War file at *build\libs\* can be deployed in any Tomcat container

```
com.stealthydev.sample.springbootmvc.Application
  extends
    SpringBootServletInitializer
  and
    overrides configure()
for this purpose
```

http://localhost:8080/ping
http://localhost:8080/book/list
http://localhost:8080/book/findBook?id=2
http://localhost:8080/book/search?author=Madhusudhan