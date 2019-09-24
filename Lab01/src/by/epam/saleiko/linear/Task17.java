package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		System.out.println( (Math.pow(number1, 3)+Math.pow(number2, 3))/2 );
		System.out.println( Math.pow(Math.abs(number1)*Math.abs(number2),0.5) );
	}

}
