package FinalTest;

import sef.module8.activity.ArithmeticExceptionActivity;

public class ThirdActivity {

	public static void main(String[] args) {
		
		ThirdActivity obj = new ThirdActivity();
		obj.gotIt();
	}

	public void gotIt() {
		int a = 3;
		int b = 0;
		try {
		int result = a/b;
			System.out.println("The correct result is: " + result);
		}

		catch(ArithmeticException e) {
			System.out.println("Please, recalculate!");
		}
		
	}
}
