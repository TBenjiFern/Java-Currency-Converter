# Overview

This software is a "Currency Converter" program which tries to do exactly that, convert currency from one type to another (i.e. US Dollars to Japanese Yen). This program will prompt the user for a "from" currency and a "to" currency type, retrieve the conversion rate from within a hardcoded HashMap of conversion rates, and then perform the conversion rate on an amount, designated by the user, to be printed to the screen. 

My purpose for writing this software was to, first of all, learn basic Java syntax and practice writing familiar code in a Java-esque fashion. In truth, making a currency converter isn't very hard at all, but I needed to learn how variables, expressions, conditionals (such as if-else statements), loops, functions, and classes worked in Java to make this software work. On top of this, storing the conversion rates locally in the program would also allow me to implement a data structure of some sort. I researched how to create array lists, linked lists, HashSets, and, lastly, HashMaps to determine which data structure would work best for my project. 

In the long run, I believe that I was successful in creating an operational, small-scale version of a currency converter which implements all of the aspects of Java I described above whilst using a HashMap. 


[Currency Converter Software Demonstration + Explanation](https://youtu.be/wYhqJYq9QWo)

# Development Environment

* Visual Studio Code
* VSCode Java Extensions:
1. Debugger for Java
1. Extension Pack for Java
1. Language Support for Java
1. Maven for Java
1. Project Manager for Java
* Java JDK version 17.0.1
* java.util.Scanner
* java.util.HashMap

# Useful Websites

* [w3schools - Java](https://www.w3schools.com/java/default.asp)
* [Oracle - Java v17 Documentation](https://docs.oracle.com/en/java/javase/17/index.html)
* [Popular Currency Type and Conversions](https://www.convertworld.com/en/currency/)


# Future Work

* Use an API (possible the Java Money and Currency API) to import updated currency types and conversion rates into the program to replace the hardcoded HashMap.
* Alternatively, access a cloud database which keeps updated currency rates. Regularly import updated currency rates into a HashMap constructor class to allow the program to run.
* Change the program to run in a localhost rather than in terminal (provide a better UI). 