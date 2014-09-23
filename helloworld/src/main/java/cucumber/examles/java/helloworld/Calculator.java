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

	public Calculator(String input, String variable, int value) {
		cString = input; 
	}

	public String Run() {
	    Object eval = expression.evaluate(jexlContext);
	    return eval.toString();
	}

	public String Run(String variable, int value) {
		jexlContext.set("b", value);
	    Object eval = expression.evaluate(jexlContext);
	    return eval.toString();
	}

}
