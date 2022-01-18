# Project Object

---

The project object is implicit on the **build.gradle**, and each sections i.e. plugins, repositories, dependencies, etc are method of that Project object.
These methods have a clousure as parameters, thus, there is no parenthesis.
i.e. instead of **project.repositories({})**, we see **repositories {}**

When we run **$gradle build**, gradle create our object call project, everything in the script are methods of that object.

# Task Object

---

```sh
$gradle tasks
```

will print all default tasks and the ones that come with plugin, e.g. java tasks.

```sh
$gradle compile
```

Gradle will create object of those tasks and it'll add those task to the project. e.g.

```
Task task  = new compile()
project.addTask(task)
```

so, all the tasks will be added to the project object during the build process.

```
project.task(firstTask){
  println 'Gradle rocks!!'
}
-->
task firstTask{
  println 'Gradle rocks!!'
}

```

the sentences will be to the doLast() method.

# Task relations

```grovy
deployToProd.dependsOn deployToStage // before prod it run deploytToStage.

deployToProd.finalizedBy cleanupFiles  //to run after a particular task

//to execute default tasks
defaultTasks "deployToStage"
```
