/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Liters extends NumericValue implements Volume{

	public static final double _scale =
		Multiplyers.milli * CubicMeters._scale;
	
	public Liters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "liters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Liters zero() {
		return new Liters(0);
	}
	
	public static Liters one() {
		return new Liters(1);
	}
	
	public Liters plus(Liters other) {
		return new Liters(value() + other.value());
	}
	
	public Liters minus(Liters other) {
		return new Liters(value() - other.value());
	}
	
	public Liters opposite() {
		return new Liters(-value());
	}

	public Liters multiplyByScalar(double scalar) {
		return new Liters(scalar * value());
	}
	
	public Liters divideByScalar(double scalar) {
		return new Liters(value() / scalar);
	}
	
	public boolean equals(Liters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static Liters castFrom(Volume other) {
		return castFromWithoutValidate(other);
	}

	public static Liters castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static Liters castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static Liters castFromScale(double value, double scale) {
		return new Liters(value * scale / _scale);
	}

	private static <E extends IllegalArgumentException> void
		validateTypeCode(Ratio typeCode, Class<E> exceptionClass) {
		try {
			if (!typeCode.equals(_typeCode))
				throw exceptionClass.newInstance();
		}
		catch(ReflectiveOperationException e) {
		}
	}

	public static Liters divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Liters multiply(Unit... units) {
		List<Unit> unitsAsList = Arrays.asList(units);
		validateTypeCode(
				unitsAsList.stream()
				.map((unit) -> unit.typeCode())
				.reduce(Ratio.one(), (a, b) -> a.multiply(b)),
				IllegalUnitsMultiplication.class);
		double newValue = unitsAsList.stream()
				.mapToDouble((unit) -> unit.value())
				.reduce(1, (a, b) -> a * b);
		double newScale = unitsAsList.stream()
				.mapToDouble((unit) -> unit.scale())
				.reduce(1, (a, b) -> a * b);
		return castFromScale(newValue, newScale);
	}
}