# Emerging-Technologies_Assignment-01

Final Assignment ( Cumulative)

This assignment covers following aspects
  - Build new test automation framework or extend existing framework for new set of test cases identified for given application
  - Develop Cucumber feature file for above nes test cases and extend the framework to cater a BDD scenario
  - Extend the solution with some AI concepts.
  
Application : https://demo.actitime.com/

Requirement : 
The HR Management application allows the HR to login with valid username and valid password. The HR once logged into the system successfully can
be able to look into Employee profiles and review leaves and attendance reports and Approval/rejection of the timesheets. Tech Coverage : Java, TestNG, 
Selenium,Maven,Excel/My SQL, Page Object Model Design , Extent Reports, log4j , GitHub

Section 1;
  1. Download below BDD code from GIThub location. Alternatively you may build your own framework as well.
          https://github.com/sarath-kadigamugedara/BDD_Demo
  2. Understand the framework based on below mentioned attributes and add new test case(s) for below scenario ( New user creation).
          a. Logging to the system as admin user
          b. Click on Users → New User
          c. Fill the mandatory fields and create a new user
          d. Validate that new user created successfully.
          
Framework Attributes:
  - Build new test automation framework or extend existing framework for new set of test cases identified for given application
  - Develop Cucumber feature file for above nes test cases and extend the framework to cater a BDD scenario
  - Extend the solution with some AI concepts.
        - Build Hybrid Test Framework -- Page Object Model + Data Driven framework + TestNG & Maven Project Structure
        - Corresponding packages for -- Scripting
        - Page Layer : Creating and storing the test object description using Page Factory – Framework
        ○ Test Layer : Multiple test cases using TestNG annotations – Framework
        ○ Test Base : Prerequisite of initializing the drivers, properties, etc. – Framework
        ○ Configuration files : to store environment variables in .properties file like, URL, Default username and passwords, browser instances etc. – Framework
        ○ Test data files : Excels, My SQL DB, Property file
        ○ Utilities : to store screenshots, generic functions, common utilities, emails etc.
        ○ Reports using HTML, XML, Extent Reports etc.- Framework
        ● Executable Automation Scripts with capable of capturing screen images of failure test cases by fetching the data from DB , excel, property file.
        ● Capture all the logs using log4j
        
        
Section 2:
        Write down a feature for the above scenario ( New user creation) and implement the required step definitions to automate it.
        
Section 3:
        In the given solution, there is page time out and wait time has been hardcorded in the TestUtil class. Please extend this with some AI concepts to build a solution to identify at
        least two different browsers and accommodate two different timeouts and wait time automatically.

Please refer below content as reference materials.
      ● https://www.youtube.com/watch?v=P9ZWOWm7i0k
      https://www.guru99.com/selenium-tutorial.html
      
      
