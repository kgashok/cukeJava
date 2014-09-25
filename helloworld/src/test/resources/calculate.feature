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
  	
  Scenario: Evaluate a two variable expression
  	Given the input "(a + b) * (a - b) + 2"
  	And the variable "a" is set to value 10
  	And the variable "b" is set to value 5  
  	When the calculator is run
  	Then the output should be "77"
  	
  Scenario: Evaluate an uninitialized expression
  	Given the input "a/b"
  	And the variable "a" is set to value 10
  	But the variable "b" is not set  
  	When the calculator is run
  	Then the output should be "Error"
  	
  Scenario: Evaluate a division by zero
  	Given the input "a / b"
  	And the variable "a" is set to value 10
  	And the variable "b" is set to value 0  
  	When the calculator is run
  	Then the output should be "Overflow"