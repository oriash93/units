/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.angular_speed.*;

public class AngularSpeedCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromDegreespersecondToMilspersecond() {
		checkCastedValue(DegreesPerSecond.one().castTo(MilsPerSecond.class), new MilsPerSecond(17.7777777777777));
	}

	@Test
	public void testCastFromDegreespersecondToRadianspersecond() {
		checkCastedValue(DegreesPerSecond.one().castTo(RadiansPerSecond.class), new RadiansPerSecond(0.017453292519937));
	}

	@Test
	public void testCastFromMilspersecondToDegreespersecond() {
		checkCastedValue(MilsPerSecond.one().castTo(DegreesPerSecond.class), new DegreesPerSecond(0.05625));
	}

	@Test
	public void testCastFromMilspersecondToRadianspersecond() {
		checkCastedValue(MilsPerSecond.one().castTo(RadiansPerSecond.class), new RadiansPerSecond(9.8174770424E-4));
	}

	@Test
	public void testCastFromRadianspersecondToDegreespersecond() {
		checkCastedValue(RadiansPerSecond.one().castTo(DegreesPerSecond.class), new DegreesPerSecond(57.2957795131));
	}

	@Test
	public void testCastFromRadianspersecondToMilspersecond() {
		checkCastedValue(RadiansPerSecond.one().castTo(MilsPerSecond.class), new MilsPerSecond(1018.59163578844));
	}


}