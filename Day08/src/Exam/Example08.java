package Exam;

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다차원 배열
		 * - 1차원 배열과 달리 행과 열로 구성된 배열을
		 * 2차원 배열
		 * 수학의 행렬과 동일한 형태
		 * int[][]arr=new int[2][3];
		 */
		 int[][]arr=new int[2][3];
		 for(int i=0; i<arr.length;i++) {
			 for(int j=0; j<arr[i].length;j++) {
				 System.out.println("arr["+i+"]"+"["+j+"] = "+arr[i][j]);
			 }
		 }
	}

}
