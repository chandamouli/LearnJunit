import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectTestOperations extends Operations{

	@Test
	void testAdditionIntegers() {
		int result;
		result = this.Addition(3, 4);
		assertEquals(7,result);
	}
	@Test
	void testSubtractionIntegers()
	{
		int result;
		result = this.Subtraction(2, 3);
		assertEquals(1,result);
	}

}
