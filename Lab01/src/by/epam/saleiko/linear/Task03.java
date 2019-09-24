package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x and y:");
		double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
		System.out.println("Value is: " + ( 2*numberOne+5*(numberTwo-2) ));
		
	}

}
