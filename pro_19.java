package dsa;

import java.util.Scanner;

public class pro_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		int leap = (year % 4 == 0 && (year % 100!= 0|| year % 400 == 0))?1:0;
		if (month == 1) {
			System.out.println(31 + "-Days");
		}
		else if (month == 2) {
			if (leap == 1) {
				System.out.println(29 + "-Days");
			}
			else {
				System.out.println(28 + "-Days");
			}
		}
		else if(month == 3) {
			System.out.println(31 + "-Days");
		}
		else if(month == 4) {
			System.out.println(30 + "-Days");
		}
		else if(month == 5) {
			System.out.println(31 + "-Days");
		}
		else if(month == 6) {
			System.out.println(30 + "-Days");
		}
		else if (month == 7) {
			System.out.println(31 + "-Days");
		}
		else if(month == 8) {
			System.out.println(31 + "-Days");
		}
		else if(month == 9) {
			System.out.println(30 + "-Days");
		}
		else if(month == 10) {
			System.out.println(31 + "-Days");
		}
		else if(month == 11) {
			System.out.println(30 + "-Days");
		}
		else if(month == 12) {
			System.out.println(31 + "-Days");
		}
		input.close();
	}

}
