package BaekJoon;

import java.util.Scanner;

public class Test2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt()-45;
		if(M<0) {
			H = H-1;
			M = 60+M;
		}
		System.out.printf("%d %d",H,M);
		sc.close();
	}

}
