package technoserveC2TC.b5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class calculatorTest {
	calculator c;
	
	@BeforeEach   
	void setup()
	{
		c=new calculator();
	}
	@Test
	void test() {
		assertEquals(5, c.add(2,3));
	}
	@ParameterizedTest
	@ValueSource(ints={1,2,3,4})
	void areatest(int args) {
		assertEquals(Math.PI*args*args, c.area(args));
		
}
}