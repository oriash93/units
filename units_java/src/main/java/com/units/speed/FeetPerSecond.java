/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.speed;

import java.util.Arrays;
import java.util.List;

import com.units.Unit;
import com.units.internal.IllegalUnitsCasting;
import com.units.internal.IllegalUnitsDivision;
import com.units.internal.IllegalUnitsMultiplication;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.duration.Seconds;
import com.units.length.Feet;


public class FeetPerSecond extends NumericValue implements Speed{

	public static final double _scale =
		Feet._scale / Seconds._scale;
	
	public FeetPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static FeetPerSecond zero() {
		return new FeetPerSecond(0);
	}
	
	public static FeetPerSecond one() {
		return new FeetPerSecond(1);
	}
	
	public FeetPerSecond plus(FeetPerSecond other) {
		return new FeetPerSecond(value() + other.value());
	}
	
	public FeetPerSecond minus(FeetPerSecond other) {
		return new FeetPerSecond(value() - other.value());
	}
	
	public FeetPerSecond opposite() {
		return new FeetPerSecond(-value());
	}

	public FeetPerSecond multiplyByScalar(double scalar) {
		return new FeetPerSecond(scalar * value());
	}
	
	public FeetPerSecond divideByScalar(double scalar) {
		return new FeetPerSecond(value() / scalar);
	}
	
	public boolean equals(FeetPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}

	public static FeetPerSecond castFrom(Speed other) {
		return castFromWithoutValidate(other);
	}

	public static FeetPerSecond castFrom(Unit other) {
		validateTypeCode(other.typeCode(), IllegalUnitsCasting.class);
		return castFromWithoutValidate(other);
	}
	
	private static FeetPerSecond castFromWithoutValidate(Unit other) {
		return castFromScale(other.value(), other.scale());
	}

	private static FeetPerSecond castFromScale(double value, double scale) {
		return new FeetPerSecond(value * scale / _scale);
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

	public static FeetPerSecond divide(Unit unit1, Unit unit2) {
		validateTypeCode(
				unit1.typeCode().divide(unit2.typeCode()),
				IllegalUnitsDivision.class);
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static FeetPerSecond multiply(Unit... units) {
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