package Exam;

public class ColorTV extends TV{
	private String color; 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ColorTV(int size,String color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	public void printProperty() {
		System.out.println(this.getSize()+"인치 "+getColor());
	}
	
}
