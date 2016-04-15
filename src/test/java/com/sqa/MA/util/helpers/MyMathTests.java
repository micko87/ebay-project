/**
 *   File Name: MyMathTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.MA.util.helpers;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
@RunWith(Parameterized.class)
public class MyMathTests {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { 2.0, 2.0, 4.0 }, { 5.0, 2.0, 25.0 }, { 4.0, 3.0, 64.0 }, { 1.0, 0.0, 1.0 },
				{ 3.0, 1.0, 3.0 }, { 2.0, 1.5, 4 } };
		return data;

	}

	private double expectedResult;
	private double num;
	private double power;

	public MyMathTests(double num, double power, double expextedResult) {
		super();
		this.expectedResult = expextedResult;
		this.num = num;
		this.power = power;
	}

	@Test
	@Ignore
	public void testDivideNumbers() {
		double result;
		double x = 8;
		double y = 2;
		result = MyMath.divideNumbers(x, y);
		System.out.println(String.format("The result of divistion %.0f and %.0f is %.0f ", x, y, result));

	}

	@Test
	@Ignore
	public void testMultNumbers() {
		double result;
		double x = 2;
		double y = 4;
		double z = 3;
		result = MyMath.multNumbers(x, y, z);
		System.out
				.println(String.format("The result of multiplication %.0f and %.0f and %.0f is %.0f", x, y, z, result));

	}

	@Test
	@Ignore
	public void testMyMathClass() {
		double result;
		double addNumber = 10;
		double subNumber = 3;
		double multNumber = 4;

		MyMath myMath = new MyMath();
		myMath.add(addNumber);
		myMath.sub(subNumber);
		myMath.mult(multNumber);
		result = myMath.getTotal();
		System.out.println(
				String.format("The result of 0 and adding " + "%.0f and than" + " subtracting" + " %.0f is %.0f",
						addNumber, subNumber, multNumber, result));

	}

	@Test
	public void testPowerNumbers() {
		double actualResult;
		double expectedResult = this.expectedResult;
		double num = this.num;
		double power = this.power;
		actualResult = MyMath.powerNumber(num, power);
		String message = String.format("The result of %.0f to the power of %.0f is %.0f", num, power, actualResult);
		System.out.println(message);
		Assert.assertEquals(message, expectedResult, actualResult, 0);
	}

}
