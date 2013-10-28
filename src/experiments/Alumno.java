package experiments;

public class Alumno {

	private int edad;
	
	private String carrera;

	public Alumno(int edad) {
		this.setEdad(edad);
	}

	public Alumno() {}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if(edad < 0) edad = 0;
		if(edad > 40) edad = 40;
		this.edad = edad;
	}
	
}
