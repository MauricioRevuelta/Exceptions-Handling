/*
Week 9 Practice Lab For Mini Exercise 3
Student: Mauricio Revuelta
Student ID: 200564969
Course: Intro Obj Oriented Prog-Java
Date: 04/03/2024

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticInputMismatchExceptions {
    // Shows when the Arithmetic Exception can occur
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // check if more input is missing

        do {
            try { // read two numbers and calculate quotient
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false; // input successful; end looping
            }
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            }
            catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);
    }

}

/*************************************************************************
 (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 Pearson Education, Inc. All Rights Reserved.                           *
 **********************************************************************/