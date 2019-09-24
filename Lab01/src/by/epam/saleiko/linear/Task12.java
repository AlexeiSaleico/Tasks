package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first coordinates:");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.println("Enter second coordinates:");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		System.out.print("Distance is: "+ Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5) );
	}
	
}
