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
