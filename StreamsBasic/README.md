# Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)

These examples and exercises are part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" by Jesper de Jong
at [Pluralsight](https://www.pluralsight.com/).

## Working with Streams - The Basics

In this module, you'll learn:

* The main concepts of streams in Java
* Differences between streams and collections
* How to create streams
* How to filter and transform elements of a stream
* How to search in a stream
* Reducing and collecting streams

### Examples

Take a look at the examples from the demos in the course, which you can find in the package: `com.pluralsight.streamslambdas.examples`.

### Exercises

To really learn any subject, it's not enough to read a website, book or watch videos. You'll have to work with the subject yourself!

To help you practice with streams and lambda expressions, there are exercises included, which you can find in the package: `com.pluralsight.streamslambdas.exercises`.

To check if you have done the exercises correctly, you can run the included unit tests. You can find the tests in the directory `src/test/java`,
package `com.pluralsight.streamslambdas.exercises`.

An IDE such as IntelliJ will make it easy to run the tests: in the Project view (on the left side), right-click one of the test classes (such as `BasicStreamsExercise01Test`) and
click "Run 'BasicStreamsExercise01Test'" from the popup menu.

### Running on the command line

This example project is a [Maven](https://maven.apache.org/) project. Apache Maven is a very widely used project management tool for Java projects. Most Java IDEs, such as IntelliJ
IDEA and Eclipse, understand Maven projects, so it should be easy to open the project in your Java IDE.

If you want or need to work with the project in a terminal window or in the Windows command prompt or PowerShell, then you can use the following commands to compile the code and
run the unit tests. The unit tests will check if you've successfully solved the exercises.

In the terminal, Windows command prompt or PowerShell, first use the `cd` command to go to the directory where you've unzipped this project. Then use one of the following commands:

On Windows:

    mvnw.cmd clean package

On macOS or Linux:

    ./mvnw clean package

These commands will download Apache Maven if you haven't already have it installed, and then run Maven to compile the code and run the unit tests.

If everything compiles without errors and all the tests succeed, the command will finish with a message that says "BUILD SUCCESS".

To compile the code without running the unit tests, add the `-DskipTests` option:

On Windows:

    mvnw.cmd clean package -DskipTests

On macOS or Linux:

    ./mvnw clean package -DskipTests
