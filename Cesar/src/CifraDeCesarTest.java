import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CifraDeCesarTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEncripta() {
		CifraDeCesar cifra = new CifraDeCesar();
		assertEquals("ymj gttp nx ts ymj yfgqj",cifra.encripta("the book is on the table", 5));
		assertEquals("sfhjt",cifra.encripta("regis", 1));
	}

}
