package experiments;

import org.junit.Assert;

import org.junit.Test;

public class generalTest {

//	@Test
//	public void testStaticCall() {
//		Assert.assertTrue("Metodo estatico no devuelve true", General.staticMethod());
//	}
	
	@Test
	// Metodo de Clase
	public void testClassMethodCall() {
		
		// Creando el objeto
		General g = new General();

		//Probando Metodos
		Assert.assertTrue("Metodo de clase no devuelve true", g.classMethod());
		Assert.assertEquals("saludo incorrecto", "hola", g.saludar());
		Assert.assertEquals("saludo incorrecto", "hola Lucas", g.saludar("Lucas"));
		Assert.assertEquals("saludo incorrecto", "hola Santi", g.saludar("Santi"));
		Assert.assertEquals("hola hola hola", g.saludar(3));
		Assert.assertEquals("hola hola hola hola hola", g.saludar(5));
		Assert.assertEquals("hola", g.saludar(1));
		Assert.assertEquals( "", g.saludar(0));
	}

}
