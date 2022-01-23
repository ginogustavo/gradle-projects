# Springboot

When you create using starter, it adds the pluging _springframework_, which is intelligent, because if you add bellow the pluging java, it adds taks that it needs if was a jar or war.

e.g.
The task **bootJar** is added by springframework pluging, as dependency as assemble. When you run assemple this bootJar will be executed.
Meaning it not only add the bootJar Task but adds as depenency of assemble.

- you can run with bootRun task.
- localhost:8080/hello

'io.spring.dependency-management' brings **build of materials**. It'll have information of all the versions that are required for the Spring boot. That information is maintained by it. Then you won't the the version in the depenencies
i.e. springframework 2.3.3 needs all this libraries verions.

## Relation with Maven

---

Pluging section ->

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    ...
</parent>
```

and in the plugin section

```xml
<build>
    <plugings>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifcatId>spring-boot-maven-plugin</artifcatId>
        </plugin>
    </plugings>
</build>

```

it bring all task are required.

and then the dependencies is same as gradle.
also using bom. Build of materials.
