# Create customized Plugins

We can start creating one task inside build.gradle and later move it to another independen file: e.g **MyAWSPlugin.groovy**

- Extend from Plugin
- The generic class can be: Project, Settings or even Gradle.
- Create the class in the folder **buildSrc**

```java
public class MyAWSPlugin implements Plugin<Project>{
    public void apply(Project project){
        project.task("copyToS3"){
            doLast{
                println "Copied to S3"
            }
        }
        project.task("deployToEC2"){
            doLast{
                println "Application is up and running on AWS EC2"
            }
        }
    }
}
```

-import that class into your build.gradle
-use as any other task
-you can even declare dpendencies
-to apply the plugin:

```groovy
apply plugin: MyAWSPlugin
```

```groovy
deployToEC2.dependsOn copyToS3
```

As building pluging, they will generated under the new **buildSrc** folder.

```sh
$gradle deployToEC2
```

if you want a quiet build (q) without all the information.

```sh
$gradle -q deployToEC2
```
