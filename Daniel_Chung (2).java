/*
Name: Daniel Chung
Student ID: 1331774
Course: CSCI 125 - Programming 1
Section: M01
 */
import java.util.Scanner; // "Main" is the starting base for various objects/blueprints
public class Daniel_Chung { // This class is the starting design for creating various code
    public static void main(String[] args) {// this is the JavaScript entry level code to create strings as arguments
        System.out.println("Welcome to your first lab!");// The code is able to create the output,"Welcome to your first lab!"
        System.out.println("Today we will be using the scanner class.");// The code is able to output, "Today we will be using the scanner class"
        System.out.println();// This is the message to the console followed by a new line of code

        Scanner scan = new Scanner(System.in);// This is a new scanner object that is able to read inputs

        System.out.println("Let's start by picking a number from 20 to 50!");//The output code would be "Let's start by picking a number from 20 to 50!""
        System.out.println("Enter the first number between 20 and 50:");// The output print could be "Enter the first number between 20 and 50:"

        int num1 = scan.nextInt();// This code is an integer value from the scanner object to variable num1

        if (num1 < 20 || num1 > 50) {// This is an "if" statement stating if the number is less than 20 or more than 50
            System.out.println("Error: The first number is not in range.");// The output would be "Error: The first number is not in range"
        } else {// This is an else statement would correspond with the active "if" statement once the integers are accurate
            System.out.println("Enter the second number between 20 and 50:");// The output is to "Enter the second number between 20 and 50:"
            int num2 = scan.nextInt();// This code is an integer value from the scanner object to variable num2

            if (num2 < 20 || num2 > 50) {// This is an "if" statement orienting that if the number are less than 20 and greater than 50
                System.out.println("Error: The second number is not in range.");// The output would read "Error: The second number is not in range."
            } else {// The else statement would correspond with the active "if" statement once the integers are accurate
                System.out.println();// The output would be getting ready send a message to the console followed by a new line of code
                System.out.println("Your first number is: " + num1);// The output would be "Your first number is:" and followed by the variable integer selected as num1
                System.out.println("Your second number is: " + num2);// The output would be "Your second number is:" and followed by the variable integer selected as num2
            }
        }// This is the end  block of code distinguished for the "else" statement
    }// This is the end block of code for the "public static void main(String[] args)" statement
}// This is the end block of code for the "public class Main" blueprint code that was created