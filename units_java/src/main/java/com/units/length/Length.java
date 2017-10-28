/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.length;

import com.units.Unit;
import com.units.exceptions.IllegalUnitsCasting;
import com.units.internal.Ratio;

public interface Length extends Unit {

	public static final Ratio _typeCode =
		new Ratio(2);

	default public <E extends Length> E castTo(Class<E> toClass) {
		try {
			double toScale = (double)toClass.getField("_scale").get(null);
			double newValue = value() * scale() / toScale;
			return toClass.getDeclaredConstructor(double.class).newInstance(newValue);
		}
		catch (ReflectiveOperationException e) {
			throw new IllegalUnitsCasting();
		}
	}

	@Override
	default public Ratio typeCode() {
		return _typeCode;
	};
}