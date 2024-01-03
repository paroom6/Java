package Exam;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 길이가 5인 배열을 입력받아 인덱스가 3인 요소만 출력하지 말고 
		 * 나머지 값만 출력
		 */
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"번째 요소 입력>>");
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			if(i!=3) {
				System.out.println(arr[i]);
			}
		}
				

	}

}
