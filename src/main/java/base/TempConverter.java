package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name

* Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32

* Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.


* Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

* Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.


 */

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius. \nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = scan.nextLine();

        double result = 0;
        if(choice.equals("C") || choice.equals("c")){

            System.out.print("Please enter the temperature in Fahrenheit: ");
            int F = scan.nextInt();
            result = ((double)F - 32) * 5/9;
            System.out.println("The temperature in Celsius is " + result);
        }
        else if(choice.equals("F") || choice.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            int C = scan.nextInt();
            result = ((double)C*9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + result);
        }
        else{
            System.out.println("Please enter a valid letter: ");
        }


    }
}
