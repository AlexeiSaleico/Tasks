package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius:");
		double radius = scanner.nextDouble();
		System.out.print("Circumference is "+ 2*Math.PI*radius + "\nArea is "+ Math.PI*radius*radius );
	}

}
