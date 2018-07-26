package cl.edo.edu.decorador;

public class CafeCasa extends Bebestible {

	public CafeCasa() {
		descripcion = "Café de la Casa";
	}

	public Double costo() {
		return Double.valueOf(1500);
	}

}