# CSBasicConcepts
Contains code for various basic concepts of computer science.


**1) digitSeparation.java**

**Input :** A number
**Output:** print separated digit of the given number

**Logic:**

**main idea**
  iterates over the number 
  divide the number by (..,100,10,1 => how many 100s - deciede depending on the number of digits) and print the quotient
  update the main number after division by saving the remainder by dividing the number by (..,100,10,1 => how many 100s - deciede depending on the number of digits)
  
**Algorithm**
  initialize no = 33, number = 1, noTemp = no (save no for future use), div = length[noTemp], i = 0, j = 0
  for i < length[no] step by 1
    for j < div-1 step by 1
      number = number*10
    noRemainder = noTemp/number
		noTemp = noTemp%number
    div = div-1
    print noRemainder
