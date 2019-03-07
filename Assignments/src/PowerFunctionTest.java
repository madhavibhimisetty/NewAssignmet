package Assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerFunctionTest {

	@Test
	void testPowerFunction() {
		PowerFunction powerFunction = new PowerFunction();
		assertEquals(16, powerFunction.power(2, 4));
	}

}
