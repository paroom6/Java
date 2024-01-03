package BaekJoon;

import java.util.Scanner;

public class Test3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int base[] = {1,1,2,2,2,8};
		int arr[]= new int [6];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(base[i]-arr[i]+" ");
		}
		sc.close();
	}

}
