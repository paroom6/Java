package Weapon;

public class WeaponMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+ weapon.fire());
		weapon= new Cannon();
		System.out.println("대포의 살상능력은 "+weapon.fire());
	}

}
