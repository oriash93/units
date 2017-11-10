package units_generator.schema_validator;

import units_generator.internal.NamesManipulator;
import units_generator.schema_validator.exceptions.EmptyName;
import units_generator.schema_validator.exceptions.InvalidSchema;
import units_generator.schema_validator.exceptions.InvalidName;

public class NamesValidator {
	
	
	/*Validation Functions*/
	public static void validateName(String name) throws InvalidSchema{
		if (!NamesManipulator.isValidName(name))
			throw new InvalidName(name);
	}
	
	public static void validatePrintedName(String name) throws InvalidSchema{
		if (!NamesManipulator.isValidPrintName(name))
			throw new EmptyName();
	}
}
