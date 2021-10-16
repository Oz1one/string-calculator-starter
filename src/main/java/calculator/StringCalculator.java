package calculator;

class StringCalculator {

    public int add(String input) {
        if(input==null || input.equals("")) //check if input string is empty
    	return 0;
       
        else {
        	
        	 String [] newarr1=delimiter(input);//created new array that stores numbers seperated by ","
        	int sum=0;
        	for(String s: newarr1) {
        		sum+=Integer.parseInt(s); //parsing the element of array as integers and adding them.
        	}
        	return sum;
        }
    }
    private static String[] delimiter(String input1) {
    	String []newarr1=input1.split(",|\n");
    	return newarr1;
    }
}