package BaekJoon;

import java.util.Scanner;

public class Test10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<N;i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]);
			}
		}
		sc.close();
	}

}
