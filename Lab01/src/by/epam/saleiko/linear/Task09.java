package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter variables:");
		double varA = scanner.nextDouble();
		double varB = scanner.nextDouble();
		double varC = scanner.nextDouble();
		double varD = scanner.nextDouble();
		System.out.println("Value is: " + ( (varC+varC*varB+varA*varD-varA*varB)/(varC*varD) ) );
	}

}
