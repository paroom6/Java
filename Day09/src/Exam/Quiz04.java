package Exam;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 피보나치 수는 0과 1로 시작 0번째 피보나치수는0
		 * 1번째는 1 그다음 부터는 바로 앞 2 피보나치수의 합이된다
		 * fn=fn-1+fn-2이다
		 * n=10일때 
		 * 1 1 2 3 5 8 13 21 34 55이다
		 * 숫자 n을 입력받아 피보나치 수열을 구하라 
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int n = sc.nextInt();
		int fibo[]= new int[n];
		if(n==1){
			System.out.println(1);
		}else{
		fibo[0]=1;
		fibo[1]=1;
		for(int i=2; i<fibo.length; i++) {
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		
		for(int i =0; i<fibo.length; i++) {
			System.out.printf("%d ",fibo[i]);
		}
		sc.close();
	}

}
}