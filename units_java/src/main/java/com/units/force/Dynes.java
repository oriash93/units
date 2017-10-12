/* This file is auto generated.
 * DO NOT EDIT IT MANUALY!
 */
package com.units.force;

import com.units.Unit;
import com.units.internal.NumericValue;
import com.units.internal.Ratio;

public class Dynes extends NumericValue implements Force{

	public static final double _scale =
		1.0E-5 * Newtons._scale;
	
	public Dynes(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "dynes";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Dynes zero() {
		return new Dynes(0);
	}
	
	public static Dynes one() {
		return new Dynes(1);
	}
	
	public Dynes plus(Dynes other) {
		return new Dynes(value() + other.value());
	}
	
	public Dynes minus(Dynes other) {
		return new Dynes(value() - other.value());
	}
	
	public Dynes opposite() {
		return new Dynes(-value());
	}

	public Dynes multiplyByScalar(double scalar) {
		return new Dynes(scalar * value());
	}
	
	public Dynes divideByScalar(double scalar) {
		return new Dynes(value() / scalar);
	}
	
	public boolean equals(Dynes other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	private static Dynes castFromScale(double value, double scale) {
		return new Dynes(value * scale / _scale);
	}

	public static Dynes castFrom(Force other) {
		return castFromScale(other.value(), other.scale());
	}

	public static Dynes divide(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().divide(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal division");
		return castFromScale(
				unit1.value() / unit2.value(),
				unit1.scale() / unit2.scale());
	}

	public static Dynes multiply(Unit unit1, Unit unit2) {
		Ratio resultTypeCode = unit1.typeCode().multiply(unit2.typeCode());
		if (!resultTypeCode.equals(_typeCode))
			throw new IllegalArgumentException("Illigal multiplication");
		return castFromScale(
				unit1.value() * unit2.value(),
				unit1.scale() * unit2.scale());
	}
}