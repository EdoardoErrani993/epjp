package ex_2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import ex.S56;


public class Test_Arm {

	@Test
	void isArmstrong() {
		 boolean actual = Amstrong.armstrong(1741725);
		 assertTrue(actual);
	}
	
	@Test
	void isnotArmstrong() {
		 boolean actual = Amstrong.armstrong(154);
		 assertFalse(actual);
	}
	
	
}
