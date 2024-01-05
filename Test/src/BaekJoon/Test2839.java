package BaekJoon;

import java.util.Scanner;

public class Test2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int f = c/5;
		int t = (c%5)/3;
		int answer = f + t;
		if((c % 5) % 3 != 0) {
			answer = -1;
		}
		
		System.out.println(answer);
	}

}
