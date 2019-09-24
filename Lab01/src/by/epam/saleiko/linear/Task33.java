package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a symbol: ");
		char symbol = scanner.next().charAt(0);
		System.out.print("Code for '"+symbol+"' is "+(int)symbol+"\nPrevious symbol is '" + (char)(symbol-1)+"'\nNext symbol is '" + (char)(symbol+1)+"'");
	}

}
