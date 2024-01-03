package BaekJoon;

import java.util.Scanner;

public class Test3052 {

	public static void main(String[] args) {
		/*
		 * 각 수를 42로 나눈 나머지의 갯수
		 * 10까지의 배열-루프로 입력
		 * 나머지의 갯수=count로 카운팅
		 * 중복되는것을 카운팅에서 제외 할 방법?
		 * 
		 * 
		 */
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[]arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<arr.length; i++) {
			int save = count;
			count++;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]%42==arr[j]%42) {
					count=save;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
