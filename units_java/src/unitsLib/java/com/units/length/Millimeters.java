/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.internal.Multipliers;


public class Millimeters extends Length {

	public static final double _scale =
		Multipliers.milli * Meters._scale;
	
	public Millimeters(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "millimeters";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Millimeters zero() {
		return new Millimeters(0);
	}
	
	public static Millimeters one() {
		return new Millimeters(1);
	}
	
	public Millimeters plus(Millimeters other) {
		return new Millimeters(value() + other.value());
	}
	
	public Millimeters minus(Millimeters other) {
		return new Millimeters(value() - other.value());
	}
	
	public Millimeters opposite() {
		return new Millimeters(-value());
	}

	public Millimeters multiplyByScalar(double scalar) {
		return new Millimeters(scalar * value());
	}
	
	public Millimeters divideByScalar(double scalar) {
		return new Millimeters(value() / scalar);
	}
	
	public double scalarRatio(Millimeters other) {
		return value() / other.value();
	}
	
	public boolean equals(Millimeters other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Millimeters other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Millimeters other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Millimeters other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Millimeters other) {
		return !lessThan(other);
	}
}