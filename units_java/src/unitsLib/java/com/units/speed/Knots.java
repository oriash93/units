/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;


public class Knots extends Speed {

	public static final double _scale =
		0.514444773689 * MetersPerSecond._scale;
	
	public Knots(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "knots";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Knots zero() {
		return new Knots(0);
	}
	
	public static Knots one() {
		return new Knots(1);
	}
	
	public Knots plus(Knots other) {
		return new Knots(value() + other.value());
	}
	
	public Knots minus(Knots other) {
		return new Knots(value() - other.value());
	}
	
	public Knots opposite() {
		return new Knots(-value());
	}

	public Knots multiplyByScalar(double scalar) {
		return new Knots(scalar * value());
	}
	
	public Knots divideByScalar(double scalar) {
		return new Knots(value() / scalar);
	}
	
	public double scalarRatio(Knots other) {
		return value() / other.value();
	}
	
	public boolean equals(Knots other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Knots other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Knots other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Knots other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Knots other) {
		return !lessThan(other);
	}
}