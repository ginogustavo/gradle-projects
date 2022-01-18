# Multi-Module App

The code spreads accross layers, and in some cases projects, e.g.

- web: host web related code: static files, restful enpoint, etc.
- services: business logic
- integration: responsible for making call to other web services or messaging apps
- data: communication with db and retrieving info.

Each layer will be used by other layer.
e.g. **Web** layer can use the **Service** layer, and service can use **integration** or **data** layer.

We will have one root project and will define the modules in the **settings.gradle**

```groovy
rootProject.name = 'couponapp'
include 'web', 'services', 'data', 'integaration'
```

Then, we can configure dependencies for each module in the root **build.gradle** or from the build.gradle each one of the modules.

```groovy
//root
project(':web'){
    dependencies{
        implementation project(':services')
    }
}
```

project: couponApp

---

You can run a comand for a specific project. e.g.

```sh
$gradle :web:clean
```

The below task will be avaiable for all sub modules:

```groovy
allprojects{
    task printProjectName{
        doLast(){
            println project.name
        }
    }
}
```

For only a specific project, use:

```groovy
subprojects{
    task printProjectName{
        doLast(){
            println project.name
        }
    }
}
```

```sh
$gradle pPN
```

This will not run for the root project.

properties

```groovy

subprojects{
    version = '1.0'
    group = 'com.inexo.gradle'
}
```

```sh
$gradle :web:clean :web:build
```

To show dependencies:

```sh
$gradle :web:dependencies
```
