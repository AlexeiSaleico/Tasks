package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n and m:");
		int smallTanksNum = scanner.nextInt();
		int largeTanksNum = scanner.nextInt();
		System.out.println("Answer is " + ((80/smallTanksNum+12)*largeTanksNum) +" liters");
	}


}
