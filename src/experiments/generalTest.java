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
	
	@Test
	public void operacionesString() {
		General g = new General();
		Assert.assertEquals("edcba", g.invertir("abcde") );
		Assert.assertEquals("Santiago", g.invertir("ogaitnaS") );
		Assert.assertEquals("oruro", g.invertir("oruro") );
		Assert.assertEquals("", g.invertir("") );
	}
	
	@Test
	public void testClases() {
		Alumno a = new Alumno();
		// Llenando datos con metodo
		a.setEdad(5);
		Assert.assertEquals("No se puso bien la edad", 5, a.getEdad() );
		a.setEdad(8);
		Assert.assertEquals("No se puso bien la edad", 8, a.getEdad() );
		a.setEdad(-8);
		Assert.assertEquals("No se puso bien la edad", 0, a.getEdad() );
		a.setEdad(800);
		Assert.assertEquals("No se puso bien la edad", 40, a.getEdad() );
		
		// Llenando dato SIN methodos
		Assert.assertEquals("No se puso bien la edad", 5, (new Alumno(5)).getEdad() );
		Assert.assertEquals("No se puso bien la edad", 8, (new Alumno(8)).getEdad() );
		Assert.assertEquals("No se puso bien la edad", 0, (new Alumno(-8)).getEdad() );
		Assert.assertEquals("No se puso bien la edad", 40, (new Alumno(800)).getEdad() );
	}
	
	@Test
	public void fibonnaci() {
		Fibonnaci f = new Fibonnaci();
		Assert.assertEquals(null, 13, f.getFibonnaci(6));
		Assert.assertEquals(null, 1, f.getFibonnaci(0));
		Assert.assertEquals(null, 1, f.getFibonnaci(1));
		
		Assert.assertEquals(null, 1, f.getFibonnaci2(0));
		Assert.assertEquals(null, 1, f.getFibonnaci2(1));
		Assert.assertEquals(null, 2, f.getFibonnaci2(2));
		Assert.assertEquals(null, 3, f.getFibonnaci2(3));
		Assert.assertEquals(null, 13, f.getFibonnaci2(6));
		
		
		
	}
}
