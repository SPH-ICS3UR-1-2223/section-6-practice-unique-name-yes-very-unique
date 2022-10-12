package DisplayMultiples;

import java.util.Scanner;

public class DisplayMultiples {

	public static void main(String args[]) {
				
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number!");
		int Number = in.nextInt();
		
		for (int repeat = 1; repeat < 13; repeat++) {
			System.out.println(Number+"x"+repeat+"="+Number*repeat);
		}
	}

}
