/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.mass;

import com.units.internal.Multipliers;


public class Milligrams extends Mass {

	public static final double _scale =
		Multipliers.milli * Grams._scale;
	
	public Milligrams(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "milligrams";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Milligrams zero() {
		return new Milligrams(0);
	}
	
	public static Milligrams one() {
		return new Milligrams(1);
	}
	
	public Milligrams plus(Milligrams other) {
		return new Milligrams(value() + other.value());
	}
	
	public Milligrams minus(Milligrams other) {
		return new Milligrams(value() - other.value());
	}
	
	public Milligrams opposite() {
		return new Milligrams(-value());
	}

	public Milligrams multiplyByScalar(double scalar) {
		return new Milligrams(scalar * value());
	}
	
	public Milligrams divideByScalar(double scalar) {
		return new Milligrams(value() / scalar);
	}
	
	public double scalarRatio(Milligrams other) {
		return value() / other.value();
	}
	
	public boolean equals(Milligrams other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Milligrams other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Milligrams other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Milligrams other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Milligrams other) {
		return !lessThan(other);
	}
}