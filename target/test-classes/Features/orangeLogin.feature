@orangelogin

Feature: Orange site User login

  Scenario: User login to Orange test site
    Given chrome browser is open
    And user is on Orange page
    When user enters username in text box
    And user enters a password in text box
    And user clicks on login button
    Then user is navigated to Dashboard page
