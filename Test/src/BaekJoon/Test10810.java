package BaekJoon;

import java.util.Scanner;

public class Test10810 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int arr[]=new int[N];
		for(int i=0; i<arr.length;i++) {
			arr[i]=0;
		}
		for(int i=0; i<M; i++) {
			int num1 =sc.nextInt()-1;
			int num2 =sc.nextInt()-1;
			int Bnum =sc.nextInt();
			for(int j=num1;j<=num2;j++) {
				arr[j]=Bnum;
			}
			
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
