package Exam;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 한개를 입력받아 수만큼 배열크기를 지정하여 
		 * 그 크기만큼 3의 배수를 저장하고 출력하세요
		 * 5을 입력
		 * 3 6 9 12 15
		 * 9입력
		 * 3 6 9 12 15 18 21 24 27
		 *  
		 */
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]= (i+1)*3;
		}
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
