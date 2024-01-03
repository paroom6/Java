package Exam;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+1+"번째 입력");
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		int list[] = {10,20,30,40,50,60,70,80};
		// list배열에서 인덱스가 3인곳에 접근하여 
		// 해당 인덱스에 저장된 데이터 출력
		for(int i=0; i<list.length; i++) {
			if(i==3) {
				System.out.println(list[i]);
			}
		}
		
		System.out.println(list[3]);
	}

}
