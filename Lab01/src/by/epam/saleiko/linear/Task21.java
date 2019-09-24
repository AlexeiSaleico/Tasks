package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
		int whole = (int)Math.floor(number);
		int fraction = (int)((number - whole)*1000);
		double result = fraction+(double)whole/1000;
		System.out.print(result);

	}

}
