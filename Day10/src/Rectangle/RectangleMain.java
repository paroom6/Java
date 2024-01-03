package Rectangle;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 가로 세로를 입력받아 
		 * 가로와 세로를 모두 초기화 하여
		 * 사각형의 넓이를 구하세요
		 * 가로 >> 10
		 * 세로 >> 20
		 * 사각형의 면적은 : 200
		 */
		Scanner sc= new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.print("가로 >> ");
		rec.width= sc.nextInt();
		System.out.print("세로 >> ");
		rec.height= sc.nextInt();
		System.out.printf("사각형의 면적은 : %d",rec.getArea());
		sc.close();
	}

}
