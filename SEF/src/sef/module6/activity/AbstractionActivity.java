package sef.module6.activity;

public class AbstractionActivity {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Shape rs = new Rectangle(5,6);
		rs.setColor("RED");
		
		 System.out.println("Color of Retengle is ..." + rs.getColor());
		 System.out.println("Area of Regtanle is " + rs.calculateArea());
		 System.out.println("Perimeter of the Rectangle is " + rs.calculatePerimeter());
		 
		 
		
	}

}
