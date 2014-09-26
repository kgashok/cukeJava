Feature: TokCalc
  Scenario: Add using a TokenCalc
  	Given the calculator is a "TokenCalc"
  	  And the input "2+2"
  	When the calculator is run
  	Then the output should be "4"
  
  Scenario: Subtract using a TokenCalc
  	Given the calculator is a "TokenCalc"
  	  And the input "9-4"
  	When the calculator is run
  	Then the output should be "5"