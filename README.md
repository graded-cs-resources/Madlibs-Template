# Madlibs Project Template

In this project you will create a program that plays a customized version of Madlibs with the user. If you don't know what madlibs is, I suggest you do a quick google search before continuing!

This project is designed to help you practice two primary skills:

1. Creating and calling methods
2. Doing user input and output to the console

## What is provided

The file `App.java` provides a skeleton for the base version of this project. It provides a method called `start()` that will be run when the program begins. The `start()` method looks like this:

```java
    public void start() {
        userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
    }
```

Upon first opening this template, it will give you many errors because the methods `getUserName()`, `printGreeting()`, `printInstruction()`, and `doMadLib()` are not defined. Your job will be to create these methods based on the following specification:

#### getUserName() method

This method should prompt the user to enter their name, wait until they enter their name, then return their name to be saved.

#### printGreeting() method

This method should accept the user's name as an argument, the print a custom greeting for that user, perhaps something as simple as "Hi *name*!"

#### printInstructions() method

This method should print instructions from the user on what they will do next

#### doMadlib() method

This method should prompt the user for all of the components necessary for the madlib, then print the resulting madlib. If desired, you can split this into smaller methods.

## Project Rubric

### Expectations for a Proficient (5)

1) All four methods are implemented as described above, with documentation in the same style as my documentation for the `start()` method
   
2) Your program prompts the user for at LEAST 10 words of various types

3) Your program prints out the madlib created by your 10+ words

4) Your code uses meaningful, readable variable names, 
   is cleanly organized, and is indented correctly.

5) Your madlib has correct spelling and reasonable spacing.

It is fine to use a madlib you did not write yourself, 
but creativity is fun so give it a try!

### Optional Extensions for a 6 or 7

(Note: you do not need to include all of these extensions to get an Exemplary, just a significant push beyond the bounds of the minimum requirements. I mostly want evidence that you had to creatively figure out how to do something *new to you*.)

1) Allow the user to choose between 2 or 3 DIFFERENT Madlibs

2) Allow the use to start the program over again and try a different madlib (this may require a loop)

3) Incorporate other interesting or creative interactions with the user, beyond just asking for words for the madlib. Making your program react differently to different inputs would be especially interesting!

4) Organize your code using custom methods that make logical sense and use good abstraction. 

5) I dunno, come up with something fun, creativity rules.