package BaekJoon;

import java.util.Scanner;

public class Test5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int arr[] =new int [30];
		for(int i=0; i<30;i++ ) {
			arr[i]=i+1;
		}
		for(int i=0; i<28;i++) {
			int num=sc.nextInt()-1;
			arr[num]=0;
		}
		for(int i=0; i<30;i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
