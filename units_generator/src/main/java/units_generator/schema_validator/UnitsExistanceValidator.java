package units_generator.schema_validator;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_generator.schema_validator.exceptions.InvalidUnitScaleCount;
import units_generator.schema_validator.exceptions.InvalidUnitTypeCount;
import units_schema.Schema;
import units_schema.UnitType;

public class UnitsExistanceValidator {
	
	/* Validation Functions*/
	public static void validateUnitTypeExistanceCount(
			Schema schema,
			String unitTypeName) throws InvalidSchema {
		long count = getUnitTypeNameCount(schema, unitTypeName); 
		if (count != 1)
			throw new InvalidUnitTypeCount(unitTypeName, count);
	}

	public static void validateUnitScaleExistanceCount(
			Schema schema,
			String unitScaleName) throws InvalidSchema {
		long count = getUnitScaleNameCount(schema, unitScaleName); 
		if (count != 1)
			throw new InvalidUnitScaleCount(unitScaleName, count);
	}
	
	public static void validateUnitScaleExistanceCount(
			UnitType unitType,
			String unitScaleName) throws InvalidSchema {
		long count = getUnitScaleNameCount(unitType, unitScaleName); 
		if (count != 1)
			throw new InvalidUnitScaleCount(unitScaleName, count);
	}
	
	/* Count Functions*/
	private static long getUnitTypeNameCount(Schema schema, String unitTypeName) {
		return schema.getUnitTypes().stream()
				.filter((someUnitType) -> NamesManipulator.getName(someUnitType).equals(unitTypeName))
				.count();
	}

	private static long getUnitScaleNameCount(Schema schema, String unitScaleName) {
		return schema.getUnitTypes().stream()
				.mapToLong((unitType) -> getUnitScaleNameCount(unitType, unitScaleName))
				.sum();
	}
	
	private static long getUnitScaleNameCount(
			UnitType unitType,
			String unitScaleName) {
		return unitType.getUnitScales().stream()
				.filter((someUnitScale) -> NamesManipulator.getName(someUnitScale).equals(unitScaleName))
				.count();
	}

}
