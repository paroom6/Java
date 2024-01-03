package BaekJoon;

import java.util.Scanner;

public class Test2903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int plus = 0;
		int line= 2;
		int n=sc.nextInt();

		for(int i=0;i<n;i++) {
			plus += (int) Math.pow(2, i);

			}
		System.out.println((line+plus)*(line+plus));
		sc.close();
	}

}
