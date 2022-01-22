# Sonar

1. Download the sonarqube
2. run from the bin/mac/ -> $ ./sonar.sh start

   - In mac, if any security issue, go to Settings / Security & Privacy / General / Allow apps downloaded.

3. localhost:9000
4. admin/admin admin/gradle

# Generate Report

1. in build.gradle, add the pluging:

```groovy
    plugings{
        id: 'org.sonarqube' version '3.0'
    }
```

2. scan through our project, with $ **gradle sonarqube**.

```sh
$gradle sonarqube -Dsonar.login=admin -Dsonar.password=gradle
```

Note: if you can to customize the url, change the file gradle.properties.
https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-gradle/
