package cl.edo.edu.decorador;

public class Expresso extends Bebestible {

	public Expresso() {
		descripcion = "Expresso";
	}

	public Double costo() {
		return Double.valueOf(1800);
	}

}