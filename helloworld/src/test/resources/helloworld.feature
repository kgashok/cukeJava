Feature: Hello World

  Scenario: Say hello
    Given I have a hello app with "Howdy"
    When I ask it to say hi
    Then it should answer with "Howdy Globe!"

  Scenario: Say helloToSomeOne
    Given I have a hello app with "Howdy"
    When I ask it to say hi to "Ashok"
    Then it should answer with "Howdy Ashok!"

  Scenario: Say helloToTwoPeople
    Given I have a hello app with "Howdy"
    When I ask it to say hi to "Ashok" and "Divya"
    Then it should address both with "Howdy Ashok and Divya"
   
  Scenario: Say helloToTwoPeople
    Given I have a hello app with "Hello"
    When I ask it to say hi to "Ashok" and "Sam"
    Then it should address both with "Hello Ashok and Sam"
  