package numToRoman;

import java.util.HashMap;

public class Converter {
	
	private static final HashMap<Integer, String> tableValue = new HashMap<Integer, String>(){{
		put(1,"I");
		put(4,"IV");
		put(5,"V");
		put(9,"IX");
		put(10,"X");
		put(40,"XL");
		put(50,"L");
		put(90,"XC");
		put(100,"C");
		put(400,"CD");
		put(500,"D");
		put(900,"CM");
		put(1000,"M");
	}};

	public String run(int num) {
		return "";
	}
	
	public String getRoman(int num){
		if(tableValue.containsKey((Integer)num)){
			return tableValue.get((Integer)num);
		}
		return "The key doesn't exist";
	}
}
