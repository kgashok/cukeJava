package cucumber.examles.java.helloworld;

import org.apache.commons.jexl2.*;

/* 
 * "The common way of using a JEXL engine is to allocate it as a singleton
 *  and use this opportunity to tailor its behavior and cache.
    private static final JexlEngine jexl = new JexlEngine();
    static {
        jexl.setCache(512);
        jexl.setLenient(false);
        jexl.setSilent(false);
    }" http://buff.ly/1quZx2p
*/

public class Calculator implements StringCalc {
	private String cString;  
	private JexlEngine jexl;
	private Expression expression;
	// required if expression has variables
	private JexlContext jexlContext;  
	
	public Calculator(String input) {
		cString = input; 
		jexl = new JexlEngine();
		// to enable exception for Division by zero
		jexl.setStrict(true);  
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
		// no idea why this doesn't work
		// if (jexlContext.has(variable) == true)  
			jexlContext.set(variable, value);
	    
	}
	
	public void SetErrorString() {
		cString = "Error";
	}

	public boolean isVariableSet(String variable) {
		Object val = jexlContext.get(variable);
		try {
			val.toString();
			return true;
		} 
		// must rewrite to use JexclException
		catch (NullPointerException e) {  
			return false;
		}
	}

	public void SetString(String input) {
		// TODO Auto-generated method stub
		cString = input;
	}
}
