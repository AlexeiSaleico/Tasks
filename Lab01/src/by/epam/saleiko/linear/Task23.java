package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an outter radius: ");
		double outRadius = scanner.nextDouble();
		System.out.print("Enter an inner radius: ");
		double inRadius = scanner.nextDouble();
		double area = Math.PI*(Math.pow(outRadius, 2)-Math.pow(inRadius, 2));
		System.out.print("Area is " + area);
		

	}

}
