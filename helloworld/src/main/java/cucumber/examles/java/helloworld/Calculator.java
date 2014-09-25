package cucumber.examles.java.helloworld;

import org.apache.commons.jexl2.*;


/* 
 * "The common way of using a JEXL engine is to allocate it as a singleton and use this opportunity to tailor its behavior and cache.
           private static final JexlEngine jexl = new JexlEngine();
            static {
               jexl.setCache(512);
               jexl.setLenient(false);
               jexl.setSilent(false);
            }" http://buff.ly/1quZx2p
*/

public class Calculator {
	private String cString;  
	private JexlEngine jexl;
	private Expression expression;
	private JexlContext jexlContext;  // used if expression has variables
	
	public Calculator(String input) {
		cString = input;
		jexl = new JexlEngine();
		jexl.setStrict(true);  // to enable exception throw for Division by zero
	    // jexl.setSilent(true);
	    // jexl.setLenient(true);
	    expression = jexl.createExpression(cString);
	    jexlContext = new MapContext();    
	}

	public String Run() {
	    if (cString == "Error")
	    	return cString;
	    
	    try {
	    	Object eval = expression.evaluate(jexlContext);
	    	return eval.toString();
		} catch (JexlException e) {
			cString = "Overflow";
			return cString;
		}
	    
	}

	public void SetVariable(String variable, int value) {
		// if (jexlContext.has(variable) == true)  // no idea why this doesn't work
			jexlContext.set(variable, value);
	    
	}

	public void isVariableSet(String variable) {
		// TODO Auto-generated method stub
		Object val = jexlContext.get(variable);
		try {
			val.toString();
		} catch (NullPointerException e) {  // must rewrite to use JexclException
			cString = "Error";
		}
	}

}
