/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.tests.density;

import org.junit.Test;

import com.units.density.KilogramsPerLiter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class KilogramsPerLiterTests {

	public void assertSameValue(double value1, double value2) {
		assertTrue("unit value is " + value1 + " instead of " + value2, value1 == value2);
	}

	@Test
	public void testConstructor() {
		double actualValue = 3.1;
		assertSameValue(new KilogramsPerLiter(actualValue).value(), actualValue);
	}

	@Test
	public void testZero() {
		KilogramsPerLiter zero = KilogramsPerLiter.zero();
		assertSameValue(zero.value(), 0);
	}

	@Test
	public void testOne() {
		KilogramsPerLiter one = KilogramsPerLiter.one();
		assertSameValue(one.value(), 1);
	}

	@Test
	public void testEqualsSuccess() {
		double actualValue = 3.1;
		assertTrue("two units are not equal, even though thet have the same value",
				new KilogramsPerLiter(actualValue).equals(new KilogramsPerLiter(actualValue)));
	}

	@Test
	public void testEqualsNullFails() {
		double actualValue = 3.1;
		assertFalse("two units are equal, even though one of the is null", new KilogramsPerLiter(actualValue).equals(null));
	}

	@Test
	public void testEqualsOtherWithDifferemtValueFail() {
		double value1 = 3.1;
		double value2 = 3.0;
		assertFalse("two units are equal, even though thet have the different values",
				new KilogramsPerLiter(value1).equals(new KilogramsPerLiter(value2)));
	}

	@Test
	public void testPlus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 5.7;

		KilogramsPerLiter unit1 = new KilogramsPerLiter(value1);
		KilogramsPerLiter unit2 = new KilogramsPerLiter(value2);
		KilogramsPerLiter result = unit1.plus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testMinus() {
		double value1 = 3.1;
		double value2 = 2.6;
		double resultValue = 0.5;

		KilogramsPerLiter unit1 = new KilogramsPerLiter(value1);
		KilogramsPerLiter unit2 = new KilogramsPerLiter(value2);
		KilogramsPerLiter result = unit1.minus(unit2);

		assertSameValue(unit1.value(), value1);
		assertSameValue(unit2.value(), value2);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testopposite() {
		double value = 3.1;

		KilogramsPerLiter unit = new KilogramsPerLiter(value);
		KilogramsPerLiter result = unit.opposite();

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), -value);
	}

	@Test
	public void testMultiplyByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 15.5;

		KilogramsPerLiter unit = new KilogramsPerLiter(value);
		KilogramsPerLiter result = unit.multiplyByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testDivideByScalar() {
		double value = 3.1;
		double scalar = 5;
		double resultValue = 0.62;

		KilogramsPerLiter unit = new KilogramsPerLiter(value);
		KilogramsPerLiter result = unit.divideByScalar(scalar);

		assertSameValue(unit.value(), value);
		assertSameValue(result.value(), resultValue);
	}

	@Test
	public void testToString() {
		double value = 3.1;
		String stringValue = "3.1 kilograms per liter";

		KilogramsPerLiter unit = new KilogramsPerLiter(value);
		assertTrue("string value is \"" + unit.toString() + "\" instead of \"" + stringValue + "\"",
				unit.toString().equals(stringValue));
	}
}