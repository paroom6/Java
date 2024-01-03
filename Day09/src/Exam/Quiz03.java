package Exam;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5행5열의 2차원 배열 array선언
		 * 21~45까지 입력 다음과 같이 출력
		 * 21	22	23	24	25
		 * 26	27	28	29	30
		 * 31	32	33	34	35
		 * 36	37	38	39	40
		 * 41	42	43	44	45
		 * 
		 */
		
		int array[][] = new int [5][5];
		int num =21;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j]=num++;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
