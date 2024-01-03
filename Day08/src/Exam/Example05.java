
package Exam;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 배열은 같은 타입의 여러변수를 하나의 묶음으로 다룸
		 * 생성된 배열은 각 저장공간을 배열의 요소라고 하며
		 * 인덱스는 배열의 요소마다 붙혀진 일련번호로 
		 * 각 요소를 구분하는데 사용한다
		 */
		int arr[] = new int[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=i+1;
			
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		String[] str = {"사과","포도","바나나"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		int list[] =null;
		list = new int[4];
		for(int i = 0; i<list.length; i++) {
			arr[i]=i+1;
			
		}
		for(int i = 0; i<list.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		int arr1[] = new int[4];
		arr1[0]=100; 
		arr1[1]=200; 
		arr1[2]=300; 
		arr1[3]=400;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		// arr1 배열의 길이
		System.out.println("arr1의 배열의 길이: "+arr1.length);
	}

}
