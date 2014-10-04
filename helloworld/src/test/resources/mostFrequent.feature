Feature: Locating the most frequent
  
  Scenario: Null list 
  Given a list that is ""
  When the list is processed
  Then the output is ""
  
  Scenario: Only one element
  Given a list that is "1"
  When the list is processed
  Then the output is "1"
  
  Scenario: Two elements are equal available
  Given a list that is "3, 1, 2, 3, 1, 5"
  When the list is processed
  Then the output is "1 3"
  
  