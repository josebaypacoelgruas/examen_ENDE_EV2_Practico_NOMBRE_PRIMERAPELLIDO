package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumerosAmigosTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testAmigoMal() {
		NumerosAmigos na1=new NumerosAmigos(1, 2);
		Integer valoresperado=1;
		boolean resultado;
		if (valoresperado==na1.esN1IgualAN2()) resultado=true;
		else resultado=false;
		assertFalse(resultado);
	}
	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos na1=new NumerosAmigos(1, 1);
		Integer valoresperado=0;
		boolean resultado;
		if (valoresperado==na1.esN1IgualAN2()) resultado=false;
		else resultado=true;
		assertTrue(resultado);
	}
	@Test
	public void testEsCeroN1() {
		int a=0;
		int b=2;
		NumerosAmigos na1=new NumerosAmigos(a, b);
		Integer valoresperado=0;
		Integer resultado = 1;
		if (a==valoresperado)resultado=null;
		assertNull(resultado);
	}
	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos na1=new NumerosAmigos(1, 1);
		Integer valoresperado=1;
		Integer resultado=na1.esN1IgualAN2();
		assertEquals(valoresperado, resultado);
	}
	@Test
	public void testN1yN2NoSonIguales() {
		NumerosAmigos na1=new NumerosAmigos(1, 2);
		Integer valoresperado=1;
		Integer resultado=na1.esN1IgualAN2();
		assertNotEquals(valoresperado, resultado);
	}
}
