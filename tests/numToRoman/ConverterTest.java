package numToRoman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {

	private Converter converter;
	
	@Before
	public void before(){
		converter = new Converter();
	}
	
	@Test
	public void canTranslate101ToCI() {
		assertEquals("CI", converter.run(101));
	}
}
