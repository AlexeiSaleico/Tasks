package by.epam.saleiko.linear;

import java.util.Scanner;

public class Task13 {
	private static double distance(double x1,double y1,double x2,double y2) {
		return Math.pow(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2),0.5);	
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first coordinates:");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.println("Enter second coordinates:");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		System.out.println("Enter third coordinates:");
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double side1_2 = distance(x1,y1,x2,y2);
		double side2_3 = distance(x3,y3,x2,y2);
		double side1_3 = distance(x1,y1,x3,y3);
		double perimeter = side1_2+side2_3+side1_3;
		double halfPerimeter = perimeter/2;
		double area = Math.pow(halfPerimeter*(halfPerimeter-side1_2)*(halfPerimeter-side2_3)*(halfPerimeter-side1_3),0.5);
		System.out.print("Perimeter is " + perimeter + "\nArea is "+area);
		
		
	}
}
