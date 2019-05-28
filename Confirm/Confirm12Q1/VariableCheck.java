public class VariableCheck {
	
	public static int classVariable = 0;
	public int instanceVariable = 0;

	public void plus() {
		classVariable++;
		instanceVariable++;
	}

	public void minus() {
		classVariable--;
		instanceVariable--;
	}
}
