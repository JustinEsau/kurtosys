@kurtosys
Feature: Kurtosys functional Ui Test

  Scenario: go to url and navigate through site
    Given browser is open
    And user is on kurtosys web page
    When user clicks Insights menu item
    And user clicks White papers button
#    And user verify text
    Then user click on article
    And user enters firstname in text box
    And user enters lastname in text box
    And user enters a text in Company text box
    And user clicks Industry dropdown
    And user clicks submit button
#    And user the close browser

