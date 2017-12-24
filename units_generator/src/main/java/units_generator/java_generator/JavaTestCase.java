package units_generator.java_generator;

import units_generator.internal.UnitsTestCaseInterface;
import units_schema.TestCase;

public class JavaTestCase implements UnitsTestCaseInterface {

	private String from;
	private String to;
	private double value;
	private String name;
	
	public JavaTestCase(TestCase testCase) {
		from = JavaNamesFormatter.toUpperCamelCase(testCase.getFrom());
		to = JavaNamesFormatter.toUpperCamelCase(testCase.getTo());
		value = testCase.getValue();
		name = JavaNamesFormatter.toLowerCamelCase("test cast from " + from + " to " + to);
	}
	
	@Override
	public String getFrom() {
		return from;
	}

	@Override
	public String getTo() {
		return to;
	}

	@Override
	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

}
