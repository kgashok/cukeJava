Feature: Calculate
  Scenario: Add two numbers
  	Given the input "2+2"
  	When the calculator is run
  	Then the output should be "4"
  
  Scenario: Subtract two numbers
  	Given the input "9-4"
  	When the calculator is run
  	Then the output should be "5"
  
  Scenario: Multiply two numbers
  	Given the input "9*4"
  	When the calculator is run
  	Then the output should be "36"
  
  Scenario: Evaluate any expression
  	Given the input "(89 * 10)/89 + 1"
  	When the calculator is run
  	Then the output should be "11"
  
  Scenario: Evaluate any variable expression
  	Given the input "(89 * b)/89 + 1"
  	When the variable "b" is set to value 10  
  	And the calculator is run
  	Then the output should be "11"
  