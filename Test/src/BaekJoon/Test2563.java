package BaekJoon;

import java.util.Scanner;

public class Test2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  10길이의 정사각형 n장 붙임
		 *  x,y로 왼쪽아래 모서리 좌표지정
		 *  총 넓이는?
		 *  3,7
		 *  15,7
		 *  5,2
		 *  (12-7)*(13-5) 
		 *  (10-x의 차)*(10-y의 차)
		 *
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]= new int[n][2];
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int x =0;
		int y =0;
		int sum=300;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(i==arr.length-1) {
					x=Math.abs(arr[i][0]-arr[0][0]);
					y=Math.abs(arr[i][0]-arr[0][0]);
					if(x<10&&y<10) {
						sum-=(10-x)*(10-y);
					}
					continue;
				}
				x=Math.abs(arr[i][0]-arr[j][0]);
				y=Math.abs(arr[i][1]-arr[j][1]);
				if(x<10&&y<10) {
					sum-=(10-x)*(10-y);
				}
			}
				
		}
			System.out.println(sum);
			sc.close();
		
	}

}
