package Assignment1;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
	@Test
	void testfibonacciSeriesIterative(){
		Fibonacci fibonacci=new Fibonacci();
        int[] expectedOrder = {0, 1, 1, 2, 3, 5,};
        fibonacci.fibonacciSeriesIterative(6);
        
        }

}
