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
	
	@Test
	public void turnsHundredsIntoRomans(){
		assertEquals("CXXI", converter.run(121));
		assertEquals("CCXXIV", converter.run(224));
		assertEquals("CCCXXXVI", converter.run(336));
		assertEquals("CDXXXIX", converter.run(439));
		assertEquals("DXLIV", converter.run(544));
		assertEquals("DCXLVI", converter.run(646));
		assertEquals("DCCLIII", converter.run(753));
		assertEquals("DCCCLXII", converter.run(862));
		assertEquals("CMLXVII", converter.run(967));
		assertEquals("CLXXIII", converter.run(173));
		assertEquals("CCCLXXXI", converter.run(381));
		assertEquals("DCCCXLVIII", converter.run(848));
		assertEquals("CMXCV", converter.run(995));
	}
	
	@Test
	public void turnsYearsIntoRomans(){
		assertEquals("MCXXI", converter.run(1121));
		assertEquals("MCCLXVI", converter.run(1266));
		assertEquals("MCCCXLV", converter.run(1345));
		assertEquals("MCCCXCV", converter.run(1395));
		assertEquals("MCDL", converter.run(1450));
		assertEquals("MDV", converter.run(1505));
		assertEquals("MDCLXVI", converter.run(1666));
		assertEquals("MDCLXXIII", converter.run(1673));
		assertEquals("MDCLXXXVIII", converter.run(1688));
		assertEquals("MDCCIII", converter.run(1703));
		assertEquals("MDCCXCIV", converter.run(1794));
		assertEquals("MDCCCIII", converter.run(1803));
		assertEquals("MDCCCLXV", converter.run(1865));
		assertEquals("MCMIV", converter.run(1904));
		assertEquals("MCMXLIII", converter.run(1943));
		assertEquals("MCMXCIX", converter.run(1999));
		assertEquals("MMCDXCV", converter.run(2495));
	}
}
