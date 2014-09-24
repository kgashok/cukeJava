package cucumber.examles.java.helloworld;

import org.apache.commons.jexl2.*;

public class Calculator {
	private String cString;  
	private JexlEngine jexl;
	private Expression expression;
	private JexlContext jexlContext;  // used if expression has variables
	
	public Calculator(String input) {
		cString = input;
		jexl = new JexlEngine();
	    jexl.setSilent(true);
	    jexl.setLenient(true);
	    expression = jexl.createExpression(cString);
	    jexlContext = new MapContext();    
	}

	public String Run() {
	    Object eval = expression.evaluate(jexlContext);
	    return eval.toString();
	}

	public void SetVariable(String variable, int value) {
		jexlContext.set(variable, value);
	    
	}

}
