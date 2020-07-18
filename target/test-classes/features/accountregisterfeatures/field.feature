Feature: check all the fields are editable in google sign up page

  Scenario: fileds are editable
    Given i entered system properties
    And I entered in google sign up page
    When I enetered value in first name filed
    And I entered value in last name field
    And I entered value in user name field
    And I entered value in password field
    And I entered value in Confirm password field
    Then values should be entered