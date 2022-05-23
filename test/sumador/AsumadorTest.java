package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsumadorTest {

	
	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumativo("5");
        assertEquals("5 = 5",resultado );
    }
	
	@Test
    public void testNegativo() {
        ASumar sumi = new ASumar();
        String resultado = sumi.siempreNegativo("-5");
        assertEquals("Negativo. Siempre negativo",resultado );
    }
	
	@Test
	public void sumatorioTotal() {
        ASumar sumi = new ASumar();
        int resultado = sumi.total("56");
        assertEquals(11 ,resultado );
    }

}
