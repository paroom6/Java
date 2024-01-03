package BaekJoon;

import java.util.Scanner;

public class Test2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]/25+" ");
			int D=arr[i]%25;
			System.out.print(D/10+" ");
			int N=D%10;
			System.out.print(N/5+" ");
			System.out.println(N%5);
		}
		sc.close();
	}

}
