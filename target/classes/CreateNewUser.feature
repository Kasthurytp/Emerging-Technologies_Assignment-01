#Author: t.kasthury66@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: feature to test create new user functionality

  @tag1
  Scenario: Check new user creation is sucessful with required data
    Given admin is on login page
    When admin enters username and password
    And clicks on login button
    Then admin is navigated to the home page
    And admin clicks on users tab
    And clciks on New User button
    And enters users firstname, lastname, email
    And clicks on Save & Send Invition button
    And view sucessfull meaage for user cretion
    And Clicks on Close button
    And navigate to users page
    
  			
  			