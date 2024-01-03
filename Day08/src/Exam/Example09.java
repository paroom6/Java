package Exam;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이차원배열은 행만 지정하고 열을 지정하지 않고 선언가능
		 * 열을 지정하지 않고 행마다 다른 길이의 배열을 저장가능
		 */
		Scanner sc = new Scanner(System.in);
		int[][]arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++) {
			int[] inArr = arr[i];
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(inArr[j]+" ");
			}
			System.out.println();
		}
	}

}
