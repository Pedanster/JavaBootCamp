package sef.module6.activity;

public class Rectangle extends Shape{

private double lenght;
private double breadth;

 	

	public Rectangle(double lenght, double breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}
	
	
	public double calculateArea() {
		// TODO Auto-generated method stub
		double mul = lenght*breadth;
		return mul;
	}


	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		double per = 2*(lenght+breadth);
		return per;
	}
	
	
}
