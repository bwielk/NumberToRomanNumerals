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
	public void romanUnitsCanBeGenerated(){
		assertEquals("I", converter.getRoman(1));
		assertEquals("X", converter.getRoman(10));
		assertEquals("XL", converter.getRoman(40));
		assertEquals("L", converter.getRoman(50));
		assertEquals("C", converter.getRoman(100));
	}
	
	@Test
	public void romanUnitsCannotBeGenerated(){
		assertEquals("The key doesn't exist", converter.getRoman(12));
		assertEquals("The key doesn't exist", converter.getRoman(42));
		assertEquals("The key doesn't exist", converter.getRoman(2));
	}
}
