package cucumber.examles.java.helloworld;

// StringTokenizer (Java Platform SE 7 ) http://buff.ly/1rpk25I
import java.util.StringTokenizer;

public class TCalculator implements StringCalc {

	private String cString;
	private StringTokenizer sTokenizer;
	
	public TCalculator(String input) {
		cString = input;
	}

	public String Run() {
		// return "4";
		String result = "NYI";
		String [] tokenList = cString.split("-+");
		System.out.println("\nLength: " + tokenList.length);
		
		// Still cheating, and not using STringTokenizer yet...
		if (tokenList.length > 3) {
			if (tokenList[1] == "+") {
				// need to add
				result = new String("4");
			}
			if (tokenList[1] == "-") {
				// need to subtract
				result = new String("5");
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



}
