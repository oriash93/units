/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.volume;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;
import com.units.length.Feet;


public class CubicFeet extends NumericValue implements Volume{

	public static final double _scale =
		Feet._scale * Feet._scale * Feet._scale;
	
	public CubicFeet(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "feet^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicFeet zero() {
		return new CubicFeet(0);
	}
	
	public static CubicFeet one() {
		return new CubicFeet(1);
	}
	
	public CubicFeet plus(CubicFeet other) {
		return new CubicFeet(value() + other.value());
	}
	
	public CubicFeet minus(CubicFeet other) {
		return new CubicFeet(value() - other.value());
	}
	
	public CubicFeet opposite() {
		return new CubicFeet(-value());
	}

	public CubicFeet multiplyByScalar(double scalar) {
		return new CubicFeet(scalar * value());
	}
	
	public CubicFeet divideByScalar(double scalar) {
		return new CubicFeet(value() / scalar);
	}
	
	public boolean equals(CubicFeet other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static CubicFeet castFromScale(double value, double scale) {
		return new CubicFeet(value * scale / _scale);
	}

	public static CubicFeet castFrom(Volume other) {
		return castFromScale(other.value(), other.scale());
	}

	public static CubicFeet divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static CubicFeet multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}