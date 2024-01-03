package Exam;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열을 생성하기위해 new연산자와  함께 자료형의 길이 지정
		 * int[] arr = new int[크기]
		 */
		int arr1[]= new int[4];
		int arr2[]= {1,2,3,4,5};
		System.out.println(arr1);
		System.out.println(arr2);
		for(int i =0; i<arr2.length; i++) {
//			배열의 길이는 배열의 객체 length 필드를 이용해서 사용가능
			System.out.println(arr2[i]);
		}

	}

}
