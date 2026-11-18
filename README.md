# Java Maven Project

A simple Java 17 Maven project with a JUnit 5 unit test and a Windows Jenkins Pipeline.

## Prerequisites
- JDK 17
- Apache Maven 3.8+ (or a compatible recent Maven release)
- Jenkins (optional, for the pipeline)

## Run locally on Windows
Open Command Prompt in this folder and run:

```cmd
java -version
mvn -version
mvn validate
mvn compile
mvn test
mvn package
```

The generated JAR will be under `target/`.

## Jenkins
Create a Pipeline job and point it to this repository's `Jenkinsfile`.
The pipeline uses Windows `bat` steps. If your Jenkins agent is Linux, replace `bat` with `sh`.
