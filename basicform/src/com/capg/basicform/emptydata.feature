Feature: Form validation if empty

Scenario: Test company name
    Given check company user name
    When enter empty value in user names text box 
    #click to be added
    Then print error message for company name field
Scenario: Test name
    Given check user name
    When enter empty value in user name text box 
    #click to be added
    Then print error message for name field
    
    Scenario: Test city name
    Given check user cityname
    When enter empty value in city text box
    Then print error message for city field

  Scenario: Test password
    Given check user password
    When enter empty value in password text box
    Then print error message for password field
    
    Scenario: Test Gender
    Given check user selection
    When enter empty value in radio box
    Then print error message for radio box
    Scenario: Test language
    Given check user selections
    When enter empty value in all selection
    Then print error message for selection field
    Scenario: Test hiddentext area
    Given check text area
    When enter empty value in text area
    Then print error message for text area field
     Scenario: Test my number
    Given check my number field
    When enter empty value in my number field
    Then print error message for my number field
     Scenario: Test email
    Given check email field
    When enter empty value in email field
    Then print error message for email field
     Scenario: Test mobilenumber
    Given check mobilenumber field
    When enter empty value in mobilenumber field
    Then print error message for mobilenumber field
    
    