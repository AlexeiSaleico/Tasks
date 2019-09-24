package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a length: ");
		double length = scanner.nextDouble();
		double sideArea = Math.pow(length, 2);
		double fullArea = sideArea*6;
		double volume = Math.pow(length, 3);
		System.out.println(sideArea);
		System.out.println(fullArea);
		System.out.println(volume);
		
	}
}
