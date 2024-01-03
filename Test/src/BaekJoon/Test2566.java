package BaekJoon;

import java.util.Scanner;

public class Test2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] =new int [9][9];
		for(int i=0; i<arr.length; i++) {
			for( int j=0; j<arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		int max=0;
		int col=0;
		int row=0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					col=i+1;
					row=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(col+","+row);
		sc.close();
	}

}
