/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.length;

import org.junit.Test;

import com.units.length.Centimeters;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CentimetersTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new Centimeters(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		Centimeters zero = Centimeters.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		Centimeters one = Centimeters.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testComparisonToSmallerValue() {
		Centimeters unit = new Centimeters(3.1);
		Centimeters comparedUnit = new Centimeters(3.0);
		assertFalse(unit.lessThan(comparedUnit));
		assertFalse(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertTrue(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToEqualValue() {
		Centimeters unit = new Centimeters(3.1);
		Centimeters comparedUnit = new Centimeters(3.1);
		assertFalse(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertTrue(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToBiggerValue() {
		Centimeters unit = new Centimeters(3.1);
		Centimeters comparedUnit = new Centimeters(3.2);
		assertTrue(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertFalse(unit.greaterThanOrEquals(comparedUnit));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null",
					new Centimeters(actualValue).equals(null));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		Centimeters unit1 = new Centimeters(value1);
		Centimeters unit2 = new Centimeters(value2);
		Centimeters result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		Centimeters unit1 = new Centimeters(value1);
		Centimeters unit2 = new Centimeters(value2);
		Centimeters result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testOpposite() {
		double value = 3.1;

		Centimeters unit = new Centimeters(value);
		Centimeters result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		Centimeters unit = new Centimeters(value);
		Centimeters result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		Centimeters unit = new Centimeters(value);
		Centimeters result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testScalarRatio() {
		double value1 = 3.1;
		double value2 = 0.62;
		double scalar = 5;

		Centimeters unit1 = new Centimeters(value1);
		Centimeters unit2 = new Centimeters(value2);

		assertSameValue(unit1.scalarRatio(unit2), scalar);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 centimeters";

		Centimeters unit = new Centimeters(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}