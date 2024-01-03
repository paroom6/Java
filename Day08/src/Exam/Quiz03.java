package Exam;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4*4의 2차원 배열을 만들고 이 배열에
		 * 1~10까지의 범위의 정수를 랜덤생성
		 * 정수16개를 배열에 저장 2차원배열을 화면에 출력
		 */
		int[][]arr=new int[4][4];
		for(int i =0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*10)+1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
