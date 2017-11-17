package practiceA;

import java.util.Scanner;

public class NextSquare2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = (int) (Math.random()*(n/2)+1);
		
		if(x*x == n) {
            System.out.println((x+1)*(x+1));			
		} else {
			System.out.println("NO~~~~~~~~~~~~~~~~~~~~~~!!!!!!!!^^");
		}

	}

}
