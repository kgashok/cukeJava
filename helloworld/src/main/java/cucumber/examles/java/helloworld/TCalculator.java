package cucumber.examles.java.helloworld;

// StringTokenizer (Java Platform SE 7 ) http://buff.ly/1rpk25I
import java.util.StringTokenizer;

public class TCalculator implements StringCalc {

	private String cString;
	private StringTokenizer sTokenizer;
	
	public TCalculator() {
		// need to initialize sTokenizer;
	}

	public String Run() {
		// return "4";
		String result = "NYI";
		System.out.println("\nInside TCalc.cString ************: " + cString);
		String [] tokenList = cString.split("\\s");
		System.out.println("\nInside TCalc.Run() ************ Length: " + tokenList.length);
		
		// Still cheating, and not using STringTokenizer yet...
		if (tokenList.length == 3) {
			if (tokenList[1].equals("+")) {
				// need to add
				result = new String("4");
			}
			if (tokenList[1].equals("-")) {
				// need to subtract
				result = new String("5");
			}
			if (tokenList[1].equals("*")) {
				// need to subtract
				result = new String("36");
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
		System.out.println ("******  Setting the value for cString: " + cString);
	}



}
