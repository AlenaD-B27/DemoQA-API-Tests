Feature: Get All Books Info

  Scenario: Verify the number of books
    When User sends GET request to receive all books information
    Then Verifies that application returns 8 results

