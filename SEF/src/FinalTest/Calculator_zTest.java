package FinalTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_zTest {
	
	
	@Test
	public void testAdd() {

	Calculator_z obj = new Calculator_z();
	int expected = 8;
	int actual = obj.add(2, 6);
	assertEquals(expected, actual);

	}	
	
	public void testMult() {

	Calculator_z obj = new Calculator_z();
	int expected1 = 12;
	int actual1 = obj.mult(2, 6);
	assertEquals(expected1, actual1);
	}
	
	public void testDiv() {

		Calculator_z obj = new Calculator_z();
		int expected2 = 6;
		int actual2 = obj.div(36, 6);
		assertEquals(expected2, actual2);
	}
	
	public void testSub() {

		Calculator_z obj = new Calculator_z();
		int expected3 = 10;
		int actual3 = obj.sub(100, 90);
		assertEquals(expected3, actual3);
	
	}
	}

