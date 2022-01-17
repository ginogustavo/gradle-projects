## Repositories

---

-Organizations can can set custom repositories:
(All the dependencies will be downloaded from that repo.)

```groovy
repositories {
    // jcenter, mavenCentral, or Maven/Ivy/File repository
    mavenCentral{
        url = ""
    }
}
```

-Maven Cental: https://mvnrepository.com/ (Also JCenter)

-Gradle downloads everything to the **~/.gradle/cache** directory, just like maven. modules-2/files-2.1

-we can have multiple dependencies

```groovy
repositories {
    mavenCentral()
    jcenter()
    mavenLocal()
}
```

## Configurations (Dependencies)

---

_src/main/java_ and _src/test/java_ are refered as **sourceSets** in gradle.

We can configure and tell gradle what dependencies :

- it should use while compiling the source code
- it should use while compiling the test
- should be available at runtime for runing source code
- should be available at runtime for runing test
- should make it to the .war file

```groovy
dependencies {
    //use at compile and runing time for source
    implementation 'com.google.guava:guava:30.1.1-jre'

    //use at compile and runing time for test
    testImplementation 'junit:junit:4.13. 2'
}
```

In the **dependencies** section you'll find the gradle configurations (which comes with **java** plugin):

- **implementation**: the dependencies here should be using during the compiling phase of src/main. And also when running the code inside. Also available in .war file.

- **testImplementation**: should be available when compiling and running tests.

other configurations:

- **compileOnly**: e.g. Dozer, Lombok, JMapper
- **runtimeOnly**: e.g logging-api, loggin-impl
- **testCompileOnly**: e.g. Junit, Jasmine, Mockito.
- **testRuntimeOnly**: e.g. Jupiter, Jasmine Runtime
- api(former compile)
