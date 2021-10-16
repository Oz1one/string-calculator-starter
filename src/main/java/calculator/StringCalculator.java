package calculator;

class StringCalculator {

    public int add(String input) {
        if(input==null || input.equals("")) //check if input string is empty
    	return 0;
        
        else {
        	String []newarr=input.split(",|\n"); //created new array that stores numbers seperated by ","
        	int sum=0;
        	for(String s: newarr) {
        		sum+=Integer.parseInt(s); //parsing the element of array as integers and adding them.
        	}
        	return sum;
        }
    }

}