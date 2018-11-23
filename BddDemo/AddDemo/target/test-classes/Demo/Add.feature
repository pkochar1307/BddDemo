Feature: Addition of numbers
Create a new account with valid csutomer and sufficient balance
Scenario Outline: Add numbers with valid input details
Given User creates object of calculator
When user pass <number1> and <number2> as input also <result> as expected
Then Display sum of two numbers
Examples:
|number1||number2||result|
|23||45||68|
|2||5||7|



Scenario Outline: Add numbers with using negative input
Given User creates object of calculator
When user pass <number3> and <number4> to add
Then It should display error message
Examples:
|number3||number4|
|'-9'||'-10'|
|'-2'||'-3'|