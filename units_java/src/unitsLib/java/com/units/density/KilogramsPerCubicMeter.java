/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.density;

import com.units.mass.Kilograms;
import com.units.volume.CubicMeters;


public class KilogramsPerCubicMeter extends Density {

	public static final double _scale =
		Kilograms._scale / CubicMeters._scale;
	
	public KilogramsPerCubicMeter(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "kilograms per cubic meter";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static KilogramsPerCubicMeter zero() {
		return new KilogramsPerCubicMeter(0);
	}
	
	public static KilogramsPerCubicMeter one() {
		return new KilogramsPerCubicMeter(1);
	}
	
	public KilogramsPerCubicMeter plus(KilogramsPerCubicMeter other) {
		return new KilogramsPerCubicMeter(value() + other.value());
	}
	
	public KilogramsPerCubicMeter minus(KilogramsPerCubicMeter other) {
		return new KilogramsPerCubicMeter(value() - other.value());
	}
	
	public KilogramsPerCubicMeter opposite() {
		return new KilogramsPerCubicMeter(-value());
	}

	public KilogramsPerCubicMeter multiplyByScalar(double scalar) {
		return new KilogramsPerCubicMeter(scalar * value());
	}
	
	public KilogramsPerCubicMeter divideByScalar(double scalar) {
		return new KilogramsPerCubicMeter(value() / scalar);
	}
	
	public double scalarRatio(KilogramsPerCubicMeter other) {
		return value() / other.value();
	}
	
	public boolean equals(KilogramsPerCubicMeter other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(KilogramsPerCubicMeter other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(KilogramsPerCubicMeter other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(KilogramsPerCubicMeter other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(KilogramsPerCubicMeter other) {
		return !lessThan(other);
	}
}