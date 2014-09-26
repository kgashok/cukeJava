Feature: TokCalc
  Scenario: Add using a TokenCalc
  	Given a calculator of type "TokenCalc"
  	  And the input "2+2"
  	When the calculator is run
  	Then the output should be "4"
  
  Scenario: Subtract using a TokenCalc
  	Given the input "9-4"
  	And the calculator is a "TokenCalc"
  	When the calculator is run
  	Then the output should be "5"