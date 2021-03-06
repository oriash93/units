/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.temperature.*;

public class TemperatureCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromKelvinsToRankines() {
		checkCastedValue(Kelvins.one().castTo(Rankines.class), new Rankines(1.8));
	}

	@Test
	public void testCastFromRankinesToKelvins() {
		checkCastedValue(Rankines.one().castTo(Kelvins.class), new Kelvins(0.5555555555));
	}


}