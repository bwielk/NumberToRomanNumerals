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
	public void turnsTeensIntoRomans(){
		assertEquals("XI", converter.run(11));
		assertEquals("XIII", converter.run(13));
		assertEquals("XIV", converter.run(14));
		assertEquals("XV", converter.run(15));
		assertEquals("XVI", converter.run(16));
		assertEquals("XVIII", converter.run(18));
		assertEquals("XIX", converter.run(19));
	}
}
