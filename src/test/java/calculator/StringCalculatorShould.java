package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {
	
	private static StringCalculator stringCalculator = new StringCalculator();
    @Test
    void empty_string_should_return_0() {
               assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        
        assertEquals(1, stringCalculator.add("1"));
    }
    //testing if method works for two 1-digit numbers
    @Test
    void string_with_two_numbers_should_return_sum() {
    	assertEquals(9, stringCalculator.add("2,7"));
    }
    //testing if method works for two 2-digit numbers
    @Test
    void string_with_two_digit_numbers_should_return_sum() {
    	assertEquals(99,stringCalculator.add("22,77"));
    }
    //testing if method works for unknown amount of digits
    @Test
    void string_with_any_amount_of_digits() {
    	assertEquals(204,stringCalculator.add("3,4,8,84,105"));
    }
    //testing if method supports \n as new delimiter
    @Test
    void string_with_new_line_as_delimiter() {
    	assertEquals(90, stringCalculator.add("20\n70"));
    }
    //testing if method supports both \n and , as delimiter
    @Test
    void string_with_new_line_and_comma_as_delimiter() {
    	assertEquals(90, stringCalculator.add("20,20\n50"));
    }
    //testing if method supports a different delimiter
    @Test
    void string_with_different_delimiters() {
    	assertEquals(90,stringCalculator.add("//;\n70;20"));
    }
  //testing if method supports a different delimiter
    @Test
    void string_with_different_delimiters_2() {
    	
    	assertEquals(90,stringCalculator.add("//.\n70.20"));
    }
    
    //testing on negative values
    @Test
    void string_with_negative_integers() {
    	try {
    		stringCalculator.add("-1,20,70");
    		fail("Exception expected");
    	}catch(RuntimeException re){
    		
    	}
    }
    
    @Test
    void string_with_negative_integers_and_giving_values() {
    	try {
    		stringCalculator.add("-1,20,70");
    		fail("Exception expected");
    	}catch(RuntimeException re){
    		assertEquals("Negatives not allowed!! [-1]", re.getMessage());
    	}
    }
    
    @Test
    void string_with_negative_integers_and_giving_values_multiple() {
    	try {
    		stringCalculator.add("-1,-20,70");
    		fail("Exception expected");
    	}catch(RuntimeException re){
    		assertEquals("Negatives not allowed!! [-1, -20]", re.getMessage());
    	}
    }
    
}
