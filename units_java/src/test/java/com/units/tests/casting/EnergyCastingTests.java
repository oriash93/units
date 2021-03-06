/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */
package com.units.tests.casting;

import org.junit.Test;
import com.units.energy.*;

public class EnergyCastingTests extends CastingTestsBase{

	@Test
	public void testCastFromCaloriesToJoules() {
		checkCastedValue(Calories.one().castTo(Joules.class), new Joules(4.184));
	}

	@Test
	public void testCastFromCaloriesToKilocalories() {
		checkCastedValue(Calories.one().castTo(Kilocalories.class), new Kilocalories(0.001));
	}

	@Test
	public void testCastFromCaloriesToKilojoules() {
		checkCastedValue(Calories.one().castTo(Kilojoules.class), new Kilojoules(0.004184));
	}

	@Test
	public void testCastFromCaloriesToMegajoules() {
		checkCastedValue(Calories.one().castTo(Megajoules.class), new Megajoules(4.184E-6));
	}

	@Test
	public void testCastFromJoulesToCalories() {
		checkCastedValue(Joules.one().castTo(Calories.class), new Calories(0.2390057361376673));
	}

	@Test
	public void testCastFromJoulesToKilocalories() {
		checkCastedValue(Joules.one().castTo(Kilocalories.class), new Kilocalories(2.390057361376673E-4));
	}

	@Test
	public void testCastFromJoulesToKilojoules() {
		checkCastedValue(Joules.one().castTo(Kilojoules.class), new Kilojoules(0.001));
	}

	@Test
	public void testCastFromJoulesToMegajoules() {
		checkCastedValue(Joules.one().castTo(Megajoules.class), new Megajoules(1.0E-6));
	}

	@Test
	public void testCastFromKilocaloriesToCalories() {
		checkCastedValue(Kilocalories.one().castTo(Calories.class), new Calories(1000.0));
	}

	@Test
	public void testCastFromKilocaloriesToJoules() {
		checkCastedValue(Kilocalories.one().castTo(Joules.class), new Joules(4184.0));
	}

	@Test
	public void testCastFromKilocaloriesToKilojoules() {
		checkCastedValue(Kilocalories.one().castTo(Kilojoules.class), new Kilojoules(4.184));
	}

	@Test
	public void testCastFromKilocaloriesToMegajoules() {
		checkCastedValue(Kilocalories.one().castTo(Megajoules.class), new Megajoules(0.004184));
	}

	@Test
	public void testCastFromKilojoulesToCalories() {
		checkCastedValue(Kilojoules.one().castTo(Calories.class), new Calories(239.0057361376673));
	}

	@Test
	public void testCastFromKilojoulesToJoules() {
		checkCastedValue(Kilojoules.one().castTo(Joules.class), new Joules(1000.0));
	}

	@Test
	public void testCastFromKilojoulesToKilocalories() {
		checkCastedValue(Kilojoules.one().castTo(Kilocalories.class), new Kilocalories(0.2390057361376673));
	}

	@Test
	public void testCastFromKilojoulesToMegajoules() {
		checkCastedValue(Kilojoules.one().castTo(Megajoules.class), new Megajoules(0.001));
	}

	@Test
	public void testCastFromMegajoulesToCalories() {
		checkCastedValue(Megajoules.one().castTo(Calories.class), new Calories(239005.7361376673));
	}

	@Test
	public void testCastFromMegajoulesToJoules() {
		checkCastedValue(Megajoules.one().castTo(Joules.class), new Joules(1000000.0));
	}

	@Test
	public void testCastFromMegajoulesToKilocalories() {
		checkCastedValue(Megajoules.one().castTo(Kilocalories.class), new Kilocalories(239.0057361376673));
	}

	@Test
	public void testCastFromMegajoulesToKilojoules() {
		checkCastedValue(Megajoules.one().castTo(Kilojoules.class), new Kilojoules(1000.0));
	}


}