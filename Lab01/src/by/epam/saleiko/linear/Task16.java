package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		int result = number % 10;
		number /= 10;
		result *= number % 10;
		number /= 10;
		result *= number % 10;
		number /= 10;
		result *= number % 10;
		System.out.print(result);
	}
		

}
