import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SayTheNumberTest {
	
	@Test
	void LargeNumTest() {
		assertEquals("Three Thousand Four Hundred Sixty Nine", SayTheNumber.sayTheNumber(3469L));
	}
	
	@Test
	void smallerNumTest() {
		assertEquals("Four Hundred Sixty Nine", SayTheNumber.numToWords(469L));
	}
}
