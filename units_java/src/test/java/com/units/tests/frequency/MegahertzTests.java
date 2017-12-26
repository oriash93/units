/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.frequency;

import org.junit.Test;

import com.units.frequency.Megahertz;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MegahertzTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new Megahertz(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		Megahertz zero = Megahertz.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		Megahertz one = Megahertz.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testComparisonToSmallerValue() {
		Megahertz unit = new Megahertz(3.1);
		Megahertz comparedUnit = new Megahertz(3.0);
		assertFalse(unit.lessThan(comparedUnit));
		assertFalse(unit.lessThanOrEquals(comparedUnit));
		assertFalse(unit.equals(comparedUnit));
		assertTrue(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToEqualValue() {
		Megahertz unit = new Megahertz(3.1);
		Megahertz comparedUnit = new Megahertz(3.1);
		assertFalse(unit.lessThan(comparedUnit));
		assertTrue(unit.lessThanOrEquals(comparedUnit));
		assertTrue(unit.equals(comparedUnit));
		assertFalse(unit.greaterThan(comparedUnit));
		assertTrue(unit.greaterThanOrEquals(comparedUnit));
	}
	
	@Test
	public void testComparisonToBiggerValue() {
		Megahertz unit = new Megahertz(3.1);
		Megahertz comparedUnit = new Megahertz(3.2);
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
					new Megahertz(actualValue).equals(null));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		Megahertz unit1 = new Megahertz(value1);
		Megahertz unit2 = new Megahertz(value2);
		Megahertz result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		Megahertz unit1 = new Megahertz(value1);
		Megahertz unit2 = new Megahertz(value2);
		Megahertz result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testOpposite() {
		double value = 3.1;

		Megahertz unit = new Megahertz(value);
		Megahertz result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		Megahertz unit = new Megahertz(value);
		Megahertz result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		Megahertz unit = new Megahertz(value);
		Megahertz result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testScalarRatio() {
		double value1 = 3.1;
		double value2 = 0.62;
		double scalar = 5;

		Megahertz unit1 = new Megahertz(value1);
		Megahertz unit2 = new Megahertz(value2);

		assertSameValue(unit1.scalarRatio(unit2), scalar);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 megahertz";

		Megahertz unit = new Megahertz(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}