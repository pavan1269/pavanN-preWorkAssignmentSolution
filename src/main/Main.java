package main;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		System.out.println("CHECKING FOR PALINDROME\nEnter a Number: ");
		int number = sc.nextInt();
		int reverse_number = 0, temp = number;
		while (temp > 0) {
			reverse_number = reverse_number * 10 + (temp % 10);
			temp = temp / 10;
		}
		if (reverse_number == number)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}

	// function to printPattern

	public void printPattern() {
		System.out.println("PRINTING PATTERN\nEnter a Number: ");
		int number = sc.nextInt();
		for (int i = number; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		System.out.println("CHECKING PRIME OR NOT\nEnter a Number: ");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println(number + " is not a prime number");
			return;
		}
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				System.out.println(number + " is not a prime number");
				return;
			}
		}
		System.out.println(number + " is a prime number");
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {
		System.out.println("PRINTING FIBONACCI SERIES\nEnter a Number: ");

		// initialize the first and second value as 0,1 respectively.
		int number = sc.nextInt();
		int first = 0, second = 1;
		if (number == 1)
			System.out.println(first);
		else {
			int next = 0;
			System.out.print(first + " " + second);
			for (int i = 3; i <= number; i++) {
				next = first + second;
				System.out.print(" " + next);
				first = second;
				second = next;
			}
			System.out.println();
		}
	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
