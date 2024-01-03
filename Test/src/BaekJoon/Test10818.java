package BaekJoon;

import java.util.Scanner;

public class Test10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i =0; i<N; i++) {
			arr[i]=sc.nextInt();
		}

		int min = 11000000;
		int max = 0;
		for(int i = 0; i<N; i++) {
			if(max<arr[i]) {
					max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.printf("%d %d",min,max);
		sc.close();
	}

}
