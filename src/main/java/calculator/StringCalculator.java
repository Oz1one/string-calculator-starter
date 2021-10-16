package calculator;

class StringCalculator {

    public int add(String input) {
        if(input==null || input.equals(""))
    	return 0;
        
        else {
        	String []newarr=input.split(",");
        	int sum=0;
        	for(String s: newarr) {
        		sum+=Integer.parseInt(s);
        	}
        	return sum;
        }
    }

}