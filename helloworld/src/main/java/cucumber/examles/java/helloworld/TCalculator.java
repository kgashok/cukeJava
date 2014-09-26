package cucumber.examles.java.helloworld;

// StringTokenizer (Java Platform SE 7 ) http://buff.ly/1rpk25I
import java.util.StringTokenizer;

public class TCalculator implements StringCalc {

	private String cString;
	// private StringTokenizer sTokenizer;
	private String[] tokenList;
	
	public TCalculator() {
		// need to initialize sTokenizer;
		
	}

	public String Run() {
		// return "4";
		String result = "NYI";
		int res_value = 0;
		System.out.println("\nInside TCalc.cString ************: " + cString);
		System.out.println("\nInside TCalc.Run() ************ Length: " + tokenList.length);
		
		if (tokenList == null)
			return null;
		
		// Still cheating, and not using STringTokenizer yet...
		if (tokenList.length == 3) {
			if (tokenList[1].equals("+")) {
				// need to add
				res_value = Integer.parseInt(tokenList[0]) + Integer.parseInt(tokenList[2]);
				result = String.valueOf(res_value);
			}
			if (tokenList[1].equals("-")) {
				// need to subtract
				res_value = Integer.parseInt(tokenList[0]) - Integer.parseInt(tokenList[2]);
				result = String.valueOf(res_value);
			}
			if (tokenList[1].equals("*")) {
				// need to multiply 
				res_value = Integer.parseInt(tokenList[0]) * Integer.parseInt(tokenList[2]);
				result = String.valueOf(res_value);
			}
		}
		return result;
	}

	public boolean isVariableSet(String variable) {
		// TODO Auto-generated method stub
		return false;
	}

	public void SetErrorString() {
		// TODO Auto-generated method stub
		
	}

	public void SetVariable(String variable, int val) {
		// TODO Auto-generated method stub
		
	}

	public void SetString(String input) {
		cString = input;
		tokenList = cString.split("\\s");
		System.out.println ("******  Setting the value for cString: " + cString);
	}
}
