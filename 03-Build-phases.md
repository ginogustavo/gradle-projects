## Build phases

---

- Initialiation: check build.gradle & settings.gradle to determine if it's a single module or multi module and create objects for each of the projects using the build.gradle contents.

- Configuration: Go through all the tasks(script file). e.g. it execute the println 'Gradle Rocks' in the example below. Check if the task has dependencies and build a graph, so tasks should not have cycle (infinite loop).

- Execution: runs our tasks(Compilation -> Tested -> jar/war). it runs the tasks in the right order.

```groovy
task firstTask{
    // this is not task logic, It's what you want to execute in the Configuration phase.
    println 'Gradle Rocks!' // -> in Configuration phase

    //For logic, you typically implement 2 methods:

    doFirst(){ // executed during the execution fase.
        println "do First"

    }
    doLast(){ //
        println "do Last"
    }

}
```
