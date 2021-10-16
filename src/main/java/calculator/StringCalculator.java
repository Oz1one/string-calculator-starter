package calculator;

class StringCalculator {

    public int add(String input) {
        if(input==null || input.equals(""))
    	return 0;
        else
        	return Integer.parseInt(input);
    }

}