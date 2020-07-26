# XeroAutomation
XeroAutomation is a simple Test Automation suite demonstrating the basic usage of Selenium webdriver, JUnit and Java for testing the fron-end.
The target application is the [Xero trial account - Accounting](https://login.xero.com/) website.

## Prerequisites
1. Xero trial account

## Tools 
The following tools/libraries were used in this project.

1. Eclipse IDE (or any IDE of your choice)
2. Gradle build tool (by default, this is included in Eclipse) 
3. Git Bash (optional, Git is already integrated with Eclipse)
4. JUnit 4.12 - defined in build.gradle file
5. Selenium-java:3.141.59 - defined in build.gradle
6. Java 1.8.0_102

## Usage
1. Clone this repo

```console
$ git clone https://github.com/sniperblack20/XeroAutomation.git
```

2. Navigate to where the project was downloaded.

3. Build (and test)

For eclipse users:

```console
$ ./gradlew cleanEclipse eclipse
```

Get dependencies and build the project:

```console
$ ./gradlew build
```

```console
BUILD SUCCESSFUL in 2m 35s
5 actionable tasks: 2 executed, 3 up-to-date
```

## Reports
A detailed html report will be generated when this suite is used via Eclipse or via gradle build. It can be found under \XeroAutomation\build\reports\tests\test\index.html.

## Contributing
Pull requests are not welcome. This repo is for my personal consumption only. It may be removed without prior notice.
