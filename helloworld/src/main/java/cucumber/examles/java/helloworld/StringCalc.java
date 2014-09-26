package cucumber.examles.java.helloworld;

public interface StringCalc {
	public String Run();
	public void SetVariable(String variable, int val);
	public boolean isVariableSet(String variable);
	public void SetErrorString ();
	public void SetString(String input);
}