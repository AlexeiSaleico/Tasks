package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a width: ");
		double width = scan.nextDouble();
		System.out.print("Area is: " + (width*width/2) );
	}

}
