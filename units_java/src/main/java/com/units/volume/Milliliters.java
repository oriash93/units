/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.internal.Multiplyers;


public class Milliliters extends NumericValue implements Volume{

	public static final double _scale =
		Multiplyers.milli * Liters._scale;
	
	public Milliliters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milliliters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milliliters zero() {
		return new Milliliters(0);
	}
	
	public static Milliliters one() {
		return new Milliliters(1);
	}
	
	public Milliliters plus(Milliliters other) {
		return new Milliliters(value() + other.value());
	}
	
	public Milliliters minus(Milliliters other) {
		return new Milliliters(value() - other.value());
	}
	
	public Milliliters opposite() {
		return new Milliliters(-value());
	}

	public Milliliters multiplyByScalar(double scalar) {
		return new Milliliters(scalar * value());
	}
	
	public Milliliters divideByScalar(double scalar) {
		return new Milliliters(value() / scalar);
	}
	
	public boolean equals(Milliliters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Milliliters castFromScale(double value, double scale) {
		return new Milliliters(value * scale / _scale);
	}

	public static Milliliters castFrom(Volume other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Milliliters divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Milliliters multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}