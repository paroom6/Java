package BaekJoon;

import java.util.Scanner;

public class Test1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int N=sc.nextInt();
		double arr[] = new double[N];
		for(int i =0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}

		double M =0;
		for(int i=0; i<arr.length; i++) {
			if(M<arr[i]){
				M=arr[i];
			}
		}
		
		double sum=0;
		for(int i=0;i<arr.length; i++) {
			arr[i]=(arr[i]/M)*100;
			sum+=arr[i];
		}
		double avg=sum/N;
		System.out.println(avg);
		sc.close();
	}

}
