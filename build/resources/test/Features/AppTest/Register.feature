Feature: Register

  Background:
    Given User opened the app

  Scenario: User registers with correct name and email and password
    When User in Login Page screen clicks on textViewLinkRegister
    And User in Register Page screen sendsKeys on textInputEditTextName with "Falery Mustika"
    And User in Register Page screen sendsKeys on textInputEditTextEmail with "falermus.staging@gmail.com"
    And User in Register Page screen sendsKeys on textInputEditTextPassword with "12345678"
    And User in Register Page screen sendsKeys on textInputEditTextConfirmPassword with "12345678"
    And User in Register Page screen clicks on appCompatButtonRegister
    Then Text "Registration Successful" in Register Page screen will be displayed

  Scenario: User registers with existing member
    When User in Login Page screen clicks on textViewLinkRegister
    And User in Register Page screen sendsKeys on textInputEditTextName with "Falery Mustika"
    And User in Register Page screen sendsKeys on textInputEditTextEmail with "falermus.staging@gmail.com"
    And User in Register Page screen sendsKeys on textInputEditTextPassword with "12345678"
    And User in Register Page screen sendsKeys on textInputEditTextConfirmPassword with "12345678"
    And User in Register Page screen clicks on appCompatButtonRegister
    Then Text "Email Already Exists" in Register Page screen will be displayed

  Scenario: User registers with incorrect password confirmation
    When User in Login Page screen clicks on textViewLinkRegister
    And User in Register Page screen sendsKeys on textInputEditTextName with "Falery Mustika"
    And User in Register Page screen sendsKeys on textInputEditTextEmail with "falermus.staging@gmail.com"
    And User in Register Page screen sendsKeys on textInputEditTextPassword with "12345678"
    And User in Register Page screen sendsKeys on textInputEditTextConfirmPassword with "87654321"
    And User in Register Page screen clicks on appCompatButtonRegister
    Then Text "Password Does Not Matches" in Register Page screen will be displayed

  Scenario: User registers with incorrect email
    When User in Login Page screen clicks on textViewLinkRegister
    And User in Register Page screen sendsKeys on textInputEditTextName with "Falery Mustika"
    And User in Register Page screen sendsKeys on textInputEditTextEmail with "falermus.staging"
    And User in Register Page screen sendsKeys on textInputEditTextPassword with "12345678"
    And User in Register Page screen sendsKeys on textInputEditTextConfirmPassword with "12345678"
    And User in Register Page screen clicks on appCompatButtonRegister
    Then Text "Enter Valid Email" in Register Page screen will be displayed

  Scenario: User registers with incorrect name
    When User in Login Page screen clicks on textViewLinkRegister
    And User in Register Page screen sendsKeys on textInputEditTextName with ""
    And User in Register Page screen sendsKeys on textInputEditTextEmail with "falermus.staging@gmail.com"
    And User in Register Page screen sendsKeys on textInputEditTextPassword with "12345678"
    And User in Register Page screen sendsKeys on textInputEditTextConfirmPassword with "12345678"
    And User in Register Page screen clicks on appCompatButtonRegister
    Then Text "Enter Full Name" in Register Page screen will be displayed