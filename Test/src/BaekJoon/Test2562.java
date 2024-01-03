package BaekJoon;

import java.util.Scanner;

public class Test2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max=0;
		int count=0;
		for(int i =0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				count=i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
		sc.close();
	}

}
