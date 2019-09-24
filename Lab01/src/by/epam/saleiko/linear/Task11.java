package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lengths:");
		double sideA = scanner.nextDouble();
		double sideB = scanner.nextDouble();
		double sideC = Math.pow(sideA*sideA + sideB*sideB, 0.5);
		System.out.print("Perimeter is: " + (sideA+sideB+sideC) + "\nArea is: " + (sideA*sideB/2)  );
	}

}
