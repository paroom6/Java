package BaekJoon;

import java.util.Scanner;

public class Test2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int Timer = sc.nextInt();
		if(M+Timer>=60) {
			H = H + (M+Timer)/60;
			M = (M+Timer)%60;
		}
		System.out.printf("%d %d",H,M);
		sc.close();
	}

}
