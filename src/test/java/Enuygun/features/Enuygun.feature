Feature:

  Scenario Outline: Book one way flight ticket for given date
    Given  Go to url Flight Ticket Selection Page
    And Choose from which point to board the plane
    And Choose where to go
    And Select departure date
    And Click on find cheap tickets
    And Select first ticket
    And Enter "<email>" address
    And Enter "<telephone>" number
    And Enter "<Name>"
    And Enter last "<Surname>"
    And Enter birthday date
    And Enter TC Identification "<number>"
    When Click on go to payment button
    Then Verify payment page is opened correctly

    Examples:
     | email                | telephone      | Name        | Surname     | number            |
     |testenuygun@gmail.com | 5349249857     | Burak       | ERDEMİROĞLU   | 55747763206       |