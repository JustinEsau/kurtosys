@MakeAppointment

  Feature: This feature is to make an appointment

    Scenario:
      Given the user opens a chrome browser
      And user enters a username in text box
      And user enters a password in the text box
      And user clicks on the login button
      When user clicks dropdown
      And clicks option
      And user clicks checkbox
      And user clicks radio button
      And user enters a date in text box
      And user enters a text in text box
      Then user clicks book appointment button
      And user verify text
      And user the close browser