/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.electric_charge;

import com.units.duration.Seconds;
import com.units.electric_current.Amperes;


public class Coulombs extends ElectricCharge {

	public static final double _scale =
		Amperes._scale * Seconds._scale;
	
	public Coulombs(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "coulombs";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static Coulombs zero() {
		return new Coulombs(0);
	}
	
	public static Coulombs one() {
		return new Coulombs(1);
	}
	
	public Coulombs plus(Coulombs other) {
		return new Coulombs(value() + other.value());
	}
	
	public Coulombs minus(Coulombs other) {
		return new Coulombs(value() - other.value());
	}
	
	public Coulombs opposite() {
		return new Coulombs(-value());
	}

	public Coulombs multiplyByScalar(double scalar) {
		return new Coulombs(scalar * value());
	}
	
	public Coulombs divideByScalar(double scalar) {
		return new Coulombs(value() / scalar);
	}
	
	public double scalarRatio(Coulombs other) {
		return value() / other.value();
	}
	
	public boolean equals(Coulombs other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(Coulombs other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(Coulombs other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(Coulombs other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(Coulombs other) {
		return !lessThan(other);
	}
}