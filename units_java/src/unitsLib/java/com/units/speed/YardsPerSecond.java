/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.speed;

import com.units.duration.Seconds;
import com.units.length.Yards;


public class YardsPerSecond extends Speed {

	public static final double _scale =
		Yards._scale / Seconds._scale;
	
	public YardsPerSecond(double value) {
		super(value);
	}

	@Override
	public String pluralName() {
		return "yards/second";
	}
	
	@Override
	public double scale() {
		return _scale;
	}
	
	public static YardsPerSecond zero() {
		return new YardsPerSecond(0);
	}
	
	public static YardsPerSecond one() {
		return new YardsPerSecond(1);
	}
	
	public YardsPerSecond plus(YardsPerSecond other) {
		return new YardsPerSecond(value() + other.value());
	}
	
	public YardsPerSecond minus(YardsPerSecond other) {
		return new YardsPerSecond(value() - other.value());
	}
	
	public YardsPerSecond opposite() {
		return new YardsPerSecond(-value());
	}

	public YardsPerSecond multiplyByScalar(double scalar) {
		return new YardsPerSecond(scalar * value());
	}
	
	public YardsPerSecond divideByScalar(double scalar) {
		return new YardsPerSecond(value() / scalar);
	}
	
	public double scalarRatio(YardsPerSecond other) {
		return value() / other.value();
	}
	
	public boolean equals(YardsPerSecond other) {
		if (other == null)
			return false;
		return almostEqualsValue(other.value());
	}
	
	public boolean lessThan(YardsPerSecond other) {
		return value() < other.value();
	}
	
	public boolean lessThanOrEquals(YardsPerSecond other) {
		return !other.lessThan(this);
	}
	
	public boolean greaterThan(YardsPerSecond other) {
		return other.lessThan(this);
	}
	
	public boolean greaterThanOrEquals(YardsPerSecond other) {
		return !lessThan(other);
	}
}