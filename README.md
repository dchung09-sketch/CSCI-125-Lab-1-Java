# Java Number Input and Range Validation

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This console-based Java program prompts the user to enter two integers between 20 and 50. It checks whether each number falls within the allowed range and displays both numbers if they are valid.

Developed as a programming exercise, this project demonstrates keyboard input, conditional statements, logical operators, and basic input validation.

## Features

- Reads integer input using the Scanner class.
- Validates numbers within the inclusive range of 20–50.
- Displays an error message when a number is outside the range.
- Requests the second number only if the first number is valid.
- Displays both numbers after successful validation.

## How It Works

1. The program displays a welcome message.
2. The user enters the first integer.
3. If the first integer is outside the allowed range, the program displays an error and ends.
4. If the first integer is valid, the program requests a second integer.
5. If the second integer is outside the allowed range, the program displays an error and ends.
6. If both integers are valid, the program displays their values.

## Programming Concepts

- User input with `java.util.Scanner`
- Integer variables
- Nested `if-else` statements
- Comparison operators: `<` and `>`
- Logical OR operator: `||`
- Console output with `System.out.println()`
- String concatenation

## How to Run

### Requirements

A Java Development Kit (JDK) with the `javac` and `java` commands available.

### Setup

Rename the downloaded file from `Daniel_Chung (2).java` to **`Daniel_Chung.java`**. The filename must match the public class name.

Open a terminal in the folder containing the file.

### Compile

```sh
javac Daniel_Chung.java
```

### Run

```sh
java Daniel_Chung
```

Follow the prompts and enter two integers between 20 and 50.

## Example Interaction

```text
Welcome to your first lab!
Today we will be using the scanner class.

Let's start by picking a number from 20 to 50!
Enter the first number between 20 and 50:
25
Enter the second number between 20 and 50:
40

Your first number is: 25
Your second number is: 40
```

## Current Limitations

- The program does not prompt the user to retry after an out-of-range entry.
- Non-integer input, such as text or decimal numbers, is not handled and causes an input exception.

## Learning Objective

Practice accepting user input and using conditional logic to validate values before displaying results.
