# Web App

You can use the dependencies of javax.servlet only for compile, no need to include in the war. And use the plugin **war**, and **org.pretty**

```groovy
plugins {
    id 'war'
    id 'org.gretty' version '4.0.0'
}

dependencies {
    compileOnly 'javax.servlet:javax.servlet-api:3.1.0'  //we need only during the compile
}
```

Add your servlet, and generate your war package with:

```sh
$gradle war
```

You can copy the war to your server or just use a plugin to run an embeded server with (org.pretty), with the task:

```sh
$gradle appRun
```

The server will even provide the port used:

```
http://localhost:8080/app
```
