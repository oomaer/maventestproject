import static org.junit.Assert.*;

import org.junit.Test;


public class MathlibTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void addTest() {
		Mathlib obj = new Mathlib();
		assert(10 == obj.add(6, 4));
	}
	
	public void subTest() {
		Mathlib obj = new Mathlib();
		assert(10 == obj.subtract(15, 5));
	}
	
	public void mulTest() {
		Mathlib obj = new Mathlib();
		assert(25 == obj.multiply(5, 5));
	}
	
	public void divTest() {
		Mathlib obj = new Mathlib();
		assert(3 == obj.divide(15, 5));
	}

}
