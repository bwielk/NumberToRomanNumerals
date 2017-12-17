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
	
	@Test
	public void turnsTensIntoRomans(){
		assertEquals("XXI", converter.run(21));
		assertEquals("XXIV", converter.run(24));
		assertEquals("XXXVI", converter.run(36));
		assertEquals("XXXIX", converter.run(39));
		assertEquals("XLIV", converter.run(44));
		assertEquals("XLVI", converter.run(46));
		assertEquals("LIII", converter.run(53));
		assertEquals("LXII", converter.run(62));
		assertEquals("LXVII", converter.run(67));
		assertEquals("LXXIII", converter.run(73));
		assertEquals("LXXXI", converter.run(81));
		assertEquals("LXXXVIII", converter.run(88));
		assertEquals("XCIX", converter.run(99));
	}
}
