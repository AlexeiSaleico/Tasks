package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter variables:");
		double varX = scanner.nextDouble();
		double varY = scanner.nextDouble();
		System.out.println("Value is: " + ( (Math.sin(varX)+Math.cos(varY))*Math.tan(varX*varY)/(Math.cos(varX)-Math.sin(varY)) ) );
	}

}
