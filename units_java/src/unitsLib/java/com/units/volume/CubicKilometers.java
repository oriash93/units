/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.volume;

import com.units.length.Kilometers;


public class CubicKilometers extends Volume {

	public static final double _scale =
		Kilometers._scale * Kilometers._scale * Kilometers._scale;
	
	public CubicKilometers(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilometers^3";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static CubicKilometers zero() {
		return new CubicKilometers(0);
	}
	
	public static CubicKilometers one() {
		return new CubicKilometers(1);
	}
	
	public CubicKilometers plus(CubicKilometers other) {
		return new CubicKilometers(value() + other.value());
	}
	
	public CubicKilometers minus(CubicKilometers other) {
		return new CubicKilometers(value() - other.value());
	}
	
	public CubicKilometers opposite() {
		return new CubicKilometers(-value());
	}

	public CubicKilometers multiplyByScalar(double scalar) {
		return new CubicKilometers(scalar * value());
	}
	
	public CubicKilometers divideByScalar(double scalar) {
		return new CubicKilometers(value() / scalar);
	}
	
	public double scalarRatio(CubicKilometers other) {
		return value() / other.value();
	}
	
	public boolean equals(CubicKilometers other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(CubicKilometers other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(CubicKilometers other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(CubicKilometers other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(CubicKilometers other) {
		return !lessThan(other);
	}
}