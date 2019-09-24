package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter variables:");
		double variableA = scanner.nextDouble();
		double variableB = scanner.nextDouble();
		double variableC = scanner.nextDouble();
		System.out.println("Value is: " + ( ((variableA-3)*variableB/2)+variableC ));
	}
	
}
