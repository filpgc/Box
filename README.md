# Treatwell

The file 'justmethods.java' contains just the method requested 'createBox' which calls the method 'printSequence". 
The method 'createBox' generates a new array of characters and an array of integers initialised with UNICODE values. The array of characters gets initialised with the values of the array of integers converted to chars. Those are the special characters needed to build the box. Next, the method checks if the width and the length given are greater than 1, in order to be able to build the box. Otherwise, rather than being a box it would be a single character or a line of characters, but not a box. 
This if statement could have been put at the beginning of the method in order to avoid the creation of the two arrays, if the box cannot be built, but to keep it coherent with the Treatwell.java file where three tests are conducted I kept it in the same place. Subsequent, a for loop iterates through the length (the height of the box), in each iteration the 'printSequence' procedure gets called passing the three characters needed to build that row of the box. 

In the printSequence method, the for loop iterates through the width of the box printing each character. Important here is to distinguish among the initial position (i=1), the final position (i = length), and the positions in between as not the same characters are printed in all those positions.

The file 'Treatwell.java' contains a class, the methods createBox, PrintSequence, the main method, and a method whose task is just to declare and initialise the array of characters used to build the box. Here, in this file, three tests are conducted from the main method:

createBox(10, 10, ch);  //Test 1. 
createBox(5, 8, ch);    //Test 2.
createBox(1, 8, ch);    //Test 3.
-- The first argument is the width, the second is the length, the third is the array of characters --

This is the ouput obtained:
<a href="https://ibb.co/3mpFFhP"><img src="https://i.ibb.co/F45YY7d/Screen-Shot-2019-01-09-at-11-40-26.png" alt="Screen-Shot-2019-01-09-at-11-40-26" border="0"></a>
