
public class CircularModulePrerequisiteException extends Exception {
	public CircularModulePrerequisiteException() {
		super("Circular reference: Module prerequisites reference each other so some modules can not be visited.");
	}
}
