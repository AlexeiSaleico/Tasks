package by.epam.saleiko.linear;

import java.util.Scanner;
public class Task08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter variables:");
		double varA = scanner.nextDouble();
		double varB = scanner.nextDouble();
		double varC = scanner.nextDouble();
		System.out.println("Value is: " + ( (varB+Math.pow(varB*varB+(4*varA*varC),0.5))/(2*varA)-(Math.pow(varA,3)*varC)+Math.pow(varB,-2) ) );
	}
}
