package practiceA;

import java.util.Arrays;

public class TryHelloWorld {
	int valB = 0; // Bigger Number
	int valS = 0; // Smaller Number
	int valT = 0; // Temporary Variable
	int gcd = 0; // Greatest Common Divisor
	int lcm = 0; // Least Common Multiple

	int[] answer = new int[2];

	public int[] gcdlcm(int a, int b) {
		// Greatest Common Divisor
		if (a >= b) {
			valB = a;
			valS = b;
		} else {
			valB = b;
			valS = a;
		}

		while (valS > 0) {
			valT = valB % valS;
			valB = valS;
			valS = valT;
			gcd = valB;
		}

		// Least Common Multiple
		lcm = a * b / gcd;

		// Input value
		answer[0] = gcd;
		answer[1] = lcm;

		return answer;

	}

	public static void main(String[] args) {
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}

}
