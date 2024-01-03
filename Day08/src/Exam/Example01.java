package Exam;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열(Array)
		 * - 같은 타입의 변수를 여러개 저장가능
		 * - 변수는 1개의 데이터만 저장가능하지만 배열은 여러 데이터 저장가능
		 * - 배열은 여러개의 데이터를 저장하기 위한 별도의 공간이 필요
		 * - 배열 선언만 하고 값을 부여하지 않는다면 null 키워드가 부여된다.
		 * - 데이터를 저장하기 위한 공간이 필요하므로 메모리에 필요한 만킁의 공간을 만들도록 선언함
		 * 자료형[] 변수명= new 자료형[배열의 크기];
		 * 
		 */
		// 배열선언 공간 미선언
		// 참조할 배열 객체가 없는 경우 null로 초기화 가능
		int[] arr1 = null;
		arr1 = new int[2];
		arr1[0]=10;
		arr1[1]=20;
// java.lang.NullPointerException
//		참조할 객체가 없는 변수 null 값을 가진 참조타입 변수를 사용시 발생

	}

}
