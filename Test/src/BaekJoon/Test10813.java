package BaekJoon;

import java.util.Scanner;

public class Test10813 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int arr[]=new int[N]; 
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int i=0;i<M;i++){
			int num1=sc.nextInt()-1;
			int num2=sc.nextInt()-1;
			int save=0;
			save=arr[num1];
			arr[num1]=arr[num2];
			arr[num2]=save;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
