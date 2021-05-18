package assertion.test;

import org.junit.Test;

import assertion.model.Calculator;
import junit.framework.Assert;

public class TestCalc {
	@Test
	public void addition() {
		System.out.println("************\nAddition\n");
		Assert.assertEquals(4, Calculator.add(2, 2));
		System.out.println("Addition Test passed\n");
	}
	
	@Test
	public void substraction() {
		System.out.println("************\nSubstraction\n");
		Assert.assertEquals(4, Calculator.sub(8, 4));
		System.out.println("Substraction Test passed\n");
	}
	@Test
	public void multiplication() {
		System.out.println("************\nMultiplication\n");
		Assert.assertEquals(32, Calculator.mult(8, 4));
		System.out.println("Multiplication Test passed\n");
	}
	@Test
	public void division() {
		System.out.println("************\nDivision\n");
		Assert.assertEquals(2, Calculator.div(10, 5));
		System.out.println("Division Test passed\n");
	}
	@Test
	public void Square() {
		System.out.println("************\nSquare\n");
		Assert.assertEquals(4, Calculator.sqaure(2));
		System.out.println("Square Test passed\n");
	}

}
