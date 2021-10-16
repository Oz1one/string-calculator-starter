package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {

    public int add(String input) {
        if(input==null || input.equals("")) //check if input string is empty
    	return 0;
       
        else {
        	
        	 String [] newarr1=delimiter(input);
        	 
        	int sum=0;
        	for(String s: newarr1) {
        		sum+=Integer.parseInt(s); //parsing the element of array as integers and adding them.
        	}
        	return sum;
        }
    }
    private static String[] delimiter(String input1) {
    	if(input1.startsWith("//")) {
   		 Matcher m= Pattern.compile("//(.)\n(.*)").matcher(input1);
   		 m.matches();
   		 String customDelimiter=m.group(1);
   		 String numbers= m.group(2);
   		 return numbers.split(Pattern.quote(customDelimiter));
   	 }else {
   		String []newarr1=input1.split(",|\n");
    	return newarr1;
   	 }
    	
    }
}