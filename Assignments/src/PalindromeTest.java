package Assignment1;


import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class PalindromeTest {

	@Test
	public void testisPal() {
		Palindrome p=new Palindrome();
		assertFalse(p.isPal("asdsas"));
	}

}
