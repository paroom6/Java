package Exam;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 길이가 5인 배열을 입력받아 배열안의 모든값의 
		 * 총랍과 평균을 구하시오
		 * 1번째 요소 입력>>
		 * 50
		 * 2번째 요소 입력>>
		 * 24
		 * 3번째 요소 입력>>
		 * 30
		 * 4번째 요소 입력>>
		 * 22
		 * 5번째 요소 입력>>
		 * 21
		 * 총합 : 147 평균 : 29.4
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d번째 요소 입력>>\n",i+1);
			arr[i]=sc.nextInt();
		}
		
		int sum =0;
		double avg=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		avg = (double)sum/arr.length;
		System.out.println("총합 : "+sum+"   평균 : "+avg);
		sc.close();
	}

}
