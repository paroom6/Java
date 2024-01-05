package BaekJoon;

import java.util.Scanner;

public class Test3040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int c1 = 0;
		int c2 = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(sum-arr[i]-arr[j] == 100) {
					c1 = i;
					c2 = j;
				}
			}
		}
		for(int i = 0; i < 9; i++) {
			if(i == c1 || i == c2) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}
	
}
