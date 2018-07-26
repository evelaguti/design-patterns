package cl.edo.edu.decorador;

public class Descafeinado extends Bebestible {

	public Descafeinado() {
		descripcion = "Descafeinado";
	}

	public Double costo() {
		return Double.valueOf(2000);
	}

}