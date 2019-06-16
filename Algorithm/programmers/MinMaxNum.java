package programmers;

import java.util.Scanner;

public class MinMaxNum {

	public static void main(String[] args) {
		// Define Variables
		int big, small, value, rest, greatest, least;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number");

		// Get Number
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		if (firstNum >= secondNum) {
			big = firstNum;
			small = secondNum;
		} else {
			big = secondNum;
			small = firstNum;
		}

		while (true) {
			value = big / small;
			rest = big - value * small;
			if (rest == 0) {
				least = small;
				greatest = firstNum * secondNum / least;
				System.out.print("Greatest :" + greatest + " Least : " + least);
				break;
			} else {
				big = small;
				small = rest;
			}
		}

	}

}
