# Appium-POM-Framework

This is the sample project to demostrate the usage of Appium tool to automate mobile Apps using Page Object Model(POM) Design Pattern.

# <h3>Software Requirement:
* Java 8 - JDK
* Eclipse/ IntelliJ
* TestNG plugin for Eclipse
* Maven
* NPM
* NodeJS
* Appium Server
* Android Studio
* Emulator/Real Device
 
 
# <h3>Project Structure:

Once you import the project to the IDE, you will be able to see various packages in the
project repo.

All the Page classes related to the app is available in the below package
>com.testingfoo.pages

All the test classes related to the app is available in the below package
>com.testingfoo.tests

The runner classes related to the framework is available in the runner folder.


# <h3>How to run this test?

**Step:1**: Starting the Selenium Grid in the local machine using the below command.
>java -jar selenium-server-standalone.jar -role hub

**Step:2**: Connect to the device to the local machine. You can either create a Emulator or use real device for execution.
Just type "adb devices" command in the terminal to verify the device is successfully connected or not.

**Step:3**: Create a Nodeconfig file and update the details related to the device in the file.

**Ex**:
>{
  "capabilities":
  [
    {
    "platformName": "Android",
    "deviceName": "Android Phone",
    "platformVersion": "9.0",
    "maxInstances": 1,
    "automationName":"UiAutomator2",
    "udid":"dfa3b957",
    "systemPort":"8201"
    }
  ],
    "cleanUpCycle":2000,
    "timeout":30000,
    "nodePolling": 60000,
    "proxy": "org.openqa.grid.selenium.proxy.DefaultRemoteProxy",
    "maxSession": 1,
    "register": true,
    "registerCycle": 5000,
    "hubPort": 4444,
    "hubHost": "127.0.0.1"
}

**Step:4**: Register an Appium node(Emulator/Real Device) to a Selenium Grid using below command.
>appium -p 4000 --nodeconfig /path/to/AppiumNodeConfig.json

**Step:5**: Update the above device details in the runner.xml file in the project repo.

Once the above setup is completed, you can start executing the test by any of the below mentioned methods:

1. **Using IDE**:
     * Clone this repository to the local machine.
     * Open the IDE of your choice. ( Say : Eclipse)
     * Click on File -> Import -> Maven -> Import Existing maven project.
     * Once the import is successful, Right click on POM.xml file. Select Run as -> Maven Build.
     * Once the Maven build is successful, Right click on POM.xml file. Select Run as -> Maven Clean.
     * Navigate to Resources-> Runner-> Right click on runnertestng.xml file. Select Run as -> TestNG Suite.
  
  2. **Using Terminal**:
     * Clone this repository to the local machine.
     * Open the terminal and navigate to the folder with POM.xml file.
     * Run the below command to run a specific test file       
       >mvn clean test

**Note**: </br>
1. All the files needed to run the tests such as Selenium Grid jar and nodeconfig.json is available under "ConfigFilesForSeleniumGrid" folder.
2. For android devices, it is mandatory to provide UDID and System port in the nodeconfig.json. Provide a unique system port for each devices and update the UDID accordingly in the nodeConfig.json file.
3. Also dont forget to update the device details in the runner.xml class.

# <h3>Future Work:
1. Use AppiumTestDistribution (ATD) to create the appium server and support better parallel execution of test in the framework.
  **Reference**:
  https://saikrishna321.github.io/
  
2. Use Property files / XML files to store the device details before executing the script.
3. Appium Server logs and application logs updated to a file for reference using Apache Log4J API.




