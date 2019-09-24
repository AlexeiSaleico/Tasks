package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lengths: ");
		double baseA = scanner.nextDouble();
		double baseB = scanner.nextDouble();
		System.out.print("Enter an angle: ");
		double angle = scanner.nextDouble();
		double area = Math.abs(0.25*(baseA-baseB)*(baseA+baseB)*Math.atan(angle));
		System.out.print("Area is " + area);
	}

}
