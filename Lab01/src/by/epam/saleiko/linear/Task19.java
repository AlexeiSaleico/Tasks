package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length: ");
		double length = scanner.nextDouble();
		double inscRadius = Math.pow(3, 0.5)/6*length;
		double circumscRadius = inscRadius * 2;
		double area = Math.pow(3, 0.5)/4*Math.pow(length, 2);
		double hight = inscRadius / 2;
		System.out.print("Area is "+ area + "\nHight is " + hight + "\nInscribed radius is " + inscRadius + "\nCircumscribed radius is "+ circumscRadius);

	}
}
