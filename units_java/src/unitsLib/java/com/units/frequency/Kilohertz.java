/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.frequency;

import com.units.internal.Multipliers;


public class Kilohertz extends Frequency {

	public static final double _scale =
		Multipliers.kilo * Hertz._scale;
	
	public Kilohertz(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilohertz";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Kilohertz zero() {
		return new Kilohertz(0);
	}
	
	public static Kilohertz one() {
		return new Kilohertz(1);
	}
	
	public Kilohertz plus(Kilohertz other) {
		return new Kilohertz(value() + other.value());
	}
	
	public Kilohertz minus(Kilohertz other) {
		return new Kilohertz(value() - other.value());
	}
	
	public Kilohertz opposite() {
		return new Kilohertz(-value());
	}

	public Kilohertz multiplyByScalar(double scalar) {
		return new Kilohertz(scalar * value());
	}
	
	public Kilohertz divideByScalar(double scalar) {
		return new Kilohertz(value() / scalar);
	}
	
	public double scalarRatio(Kilohertz other) {
		return value() / other.value();
	}
	
	public boolean equals(Kilohertz other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Kilohertz other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Kilohertz other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Kilohertz other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Kilohertz other) {
		return !lessThan(other);
	}
}