To create base project structure and create the build.gradle run:

```sh
$gradle init
```

Find tasks on you build.gradle

```sh
$gradle tasks
```

You can run a customized task as :

```groovy
task firstTask{
  println 'Gradle rocks!!'
}
```

```sh
$gradle firstTask
$gradle fT
```

(the camel case version runs the specific task defined in **build.gradle**)

---

-We can include:

```
group 'org.example'
version '1.0-SNAPSHOT'
```

-You can pack the jar as follow:

```groovy
jar{
    manifest{
        attributes 'Main-Class': 'com.carinfo.Application'
    }
}
```

```sh
$gradle jar
$java -jar build/libs/CarInfo.jar
```

---

-To change the name of the project, change **"rootProject.name**" on **settings.gradle.**
For multi-module project, we can add them here.

**gradle wrapper**: will install Gradle for us so we can start using it to build and run our projects.
i.e. `$./gradlew fT`
Takes the responsability of installing the appropiate version of Gradle and execute

- You can have a folder in the root with the name of your app: e.g. **myFirstProject**. There, youll have the **build.gradle**
- In the **settings.graddle** you can have:

```groovy
rootProject.name = 'Big Project Name'
include('myFirstProject')
```

- From the root or from the sub module, you can perform:

```sh
$gradle build
```

```sh
$gradle compileJava -> To generate the classes
```

```sh
$gradle clean -> To delete the build folder
```

```sh
$gradle test -> Run the tests
```

---

The pluging **application** provides the task:

```sh
$gradle run
```

It prints "Hello World" because in **build.gradle** there is:

```groovy
application {
    // Define the main class for the application.
    mainClass = 'com.mycompany.App'
}
```

---

Each dependency has a

- group id: e.g. **com.google.guava**
- artifact id: e.g. **guava**
- version: e.g. **29.0-jre**

Specify the scope, we wanted for the complete project implementation, thus:

```groovy
implementation 'com.google.guava:guava:29.0-jre'
```

And Junit is only for the Test implementation (It's not required to run our app), thus:

```groovy
 testImplementation 'junit:junit:4.13'
```

Gradle only runs the changes(incremental), but if you want to force to run everything:

```sh
 $gradle --rerun-tasks build
```
