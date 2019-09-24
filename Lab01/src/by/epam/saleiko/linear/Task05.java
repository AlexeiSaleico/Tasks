package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x and y:");
		double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
		System.out.println("Average is " + (numberOne+numberTwo)/2);
	}

}
