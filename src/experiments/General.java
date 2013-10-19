package experiments;

public class General {

//	public static boolean staticMethod() {
//		// TODO Auto-generated method stub
//		return true;
//	}

	public boolean classMethod() {
		return true;
	}

	public String saludar() {
		return "hola";
	}

	public String saludar(String nombre) {
		return "hola " + nombre;
	}

	public String saludar(int veces) {
		String holas = "";
		if(veces != 0) {
			while(veces > 1) {
				holas = holas + "hola ";
				veces = veces - 1;
			}
			holas = holas + "hola";
		}
		return holas;
	}	
	
	
	
}
