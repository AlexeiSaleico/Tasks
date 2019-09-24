package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a time: ");
		int time = scanner.nextInt();
		int hours = time /3600;
		time %= 3600;
		int minutes = time / 60;
		time %= 60;
		System.out.print(hours+"ч "+ minutes + "мин "+time+"с");

	}

}
