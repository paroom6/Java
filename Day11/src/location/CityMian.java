package location;

public class CityMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city1= new City("서울시","서초구","방배동");
		System.out.println(city1.name+"은");
		System.out.println(city1.city);
		System.out.println(city1.gu);
		System.out.println(city1.dong+"에 삽니다.");
		
		System.out.println();
		
		City city2= new City("부산시","부산진구","범일동");
		city2.name="고길동";
		
		System.out.println(city2.name+"은");
		System.out.println(city2.city);
		System.out.println(city2.gu);
		System.out.println(city2.dong+"에 삽니다.");
		
	}

}
