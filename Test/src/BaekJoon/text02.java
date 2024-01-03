package BaekJoon;

import java.util.Scanner;

public class text02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		for(int i = 1; i<=count; i++) {
		int money = sc.nextInt();
		int num = sc.nextInt();
		System.out.printf("Case #%d: %d \n",i,money+num);
		sc.close();
		}
	}
}
