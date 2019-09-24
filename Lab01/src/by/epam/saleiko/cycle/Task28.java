package by.epam.saleiko.cycle;

import java.util.Scanner;

public class Task28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		double valueX, valueY;
		while(true) {
			System.out.print("¬ведите выражение: ");
			input = scanner.nextLine();
			if (input.contentEquals("0")) break;
			else {
				int signPos = 0;
				while (signPos<input.length() && input.charAt(signPos)!='+' && input.charAt(signPos)!='-' && input.charAt(signPos)!='/' && input.charAt(signPos)!='*') {
					signPos++;}
				if (signPos == input.length()) continue;
				valueX = Double.valueOf(input.substring(0, signPos));
				valueY = Double.valueOf(input.substring(signPos+1, input.length()));
				if (input.charAt(signPos)=='+') System.out.println((valueX + valueY));
				else if (input.charAt(signPos)=='-') System.out.println((valueX - valueY));
				else if (input.charAt(signPos)=='*') System.out.println((valueX * valueY));
				else if (input.charAt(signPos)=='/' && valueY!=0) System.out.println((valueX / valueY));
			}
			
			
			
		}
	}

}
