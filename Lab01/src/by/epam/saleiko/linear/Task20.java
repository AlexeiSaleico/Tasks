package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a circumference: ");
		double circumference = scanner.nextDouble();
		double area = Math.pow(circumference, 2)/(4*Math.PI);
		System.out.print("Area is "+ area);

	}

}
