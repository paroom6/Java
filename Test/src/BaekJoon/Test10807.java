package BaekJoon;

import java.util.Scanner;

public class Test10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		
		int v =sc.nextInt();
		int count = 0;
		for(int i=0; i<N; i++) {
			if(arr[i]==v) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
