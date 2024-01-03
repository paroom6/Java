package Exam;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  카페 배열 퀴즈
		 *  키보드를 통해 학생수 와 각 학생들의 점수를 입력받고
		 *  최고 최소 평균 점수를 출력
		 */
		Scanner sc =new Scanner(System.in);
		int score[]=null;
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수확인|4.분석|5.종료|");
			System.out.println("-----------------------------------");
			System.out.print(">>");
			int num=sc.nextInt();
			if(num==1) {
				System.out.print("학생 수 : ");
				int mem=sc.nextInt();
				score = new int[mem];
			}else if(num==2) {
				System.out.println("[학생들의 점수 입력]");
				for(int i=0; i<score.length;i++) {
					System.out.print((i+1)+"번 학생의 점수 : ");
					score[i]= sc.nextInt();					
				}
			}else if(num==3) {
				System.out.println("[학생들의 점수 확인]");
				for(int i=0; i<score.length;i++) {
					System.out.print((i+1)+")번 학생의 점수 : ");
					System.out.println(score[i]);					
				}
			}else if(num==4) {
				System.out.println("[학생들의 점수 분석]");
				int max=score[0];
				int min=score[0];
				int sum=0;
				for(int i=0; i<score.length;i++) {
					if(max<score[i]) {
						max=score[i];
					}
					if(min>score[i]) {
						min=score[i];
					}
					sum+=score[i];
				}
				double avg= (double)sum/score.length;
				System.out.println("최고 점수 : "+max);
				System.out.println("최저 점수 : "+min);
				System.out.println("평균 점수 : "+avg);
			}else if(num==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		sc.close();

	}

}
