/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.force;

import com.units.duration.Seconds;
import com.units.length.Meters;
import com.units.mass.Kilograms;


public class Newtons extends Force {

	public static final double _scale =
		(Kilograms._scale * Meters._scale)
		 / (Seconds._scale * Seconds._scale);
	
	public Newtons(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "newtons";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Newtons zero() {
		return new Newtons(0);
	}
	
	public static Newtons one() {
		return new Newtons(1);
	}
	
	public Newtons plus(Newtons other) {
		return new Newtons(value() + other.value());
	}
	
	public Newtons minus(Newtons other) {
		return new Newtons(value() - other.value());
	}
	
	public Newtons opposite() {
		return new Newtons(-value());
	}

	public Newtons multiplyByScalar(double scalar) {
		return new Newtons(scalar * value());
	}
	
	public Newtons divideByScalar(double scalar) {
		return new Newtons(value() / scalar);
	}
	
	public double scalarRatio(Newtons other) {
		return value() / other.value();
	}
	
	public boolean equals(Newtons other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Newtons other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Newtons other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Newtons other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Newtons other) {
		return !lessThan(other);
	}
}