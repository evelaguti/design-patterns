package cl.edo.edu.decorador;

public class Tostado extends Bebestible {

	public Tostado() {
		descripcion = "Café Tostado";
	}

	public Double costo() {
		return Double.valueOf(1300);
	}

}