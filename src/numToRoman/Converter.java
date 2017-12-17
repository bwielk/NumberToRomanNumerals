package numToRoman;

import java.util.HashMap;

public class Converter {
	
	public String run(int num) {
		
		int[]numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[]romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int number = num;
		String result = "";	
		while(number != 0){
			for(int i = 0; i<numbers.length; i++){
				if(numbers[i]<=number){
					result = result + romanNumerals[i];
					number -= numbers[i];
				}
			}
		}
		return result;
	}

}
