How to setup:

1. Download & Install java jdk 17 on https://www.oracle.com/id/java/technologies/downloads/ 
(make sure on CMD, there are java --version)
2. Download & Install Eclipse IDE
3. Download Chromedriver (make sure its same with your browser version)

On Eclipse
4. Create new maven project
5. Download important dependencies on pom.xml (selenium-java, cucumber-java, cucumber-junit, junit)
6. Create folder Hook (define setup and tearDown browser) ,StepDefinitions (glueCode of features files), Runner (define run cucumber)
7. Create folder Features that contains gherkin scenario of file
8. After that, if everything is done, then run on features file with 
 Right click - Run Cucumber Feature

On CMD
1. Go to path Directory of working space
2. Then type mvn-test


Solution:
In this case, i use CucumberFramework with BDD Gherkin style to automate login case,both positive & negative case (Login.feature). 
The CucumberFramework consist of Runner,StepDefinitions,Hook, & PageFactory
