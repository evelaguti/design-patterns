package cl.edo.edu.decorador;

/**
 * Es un condimento
 */

public class Crema extends DecoradorCondimentos {

	Bebestible bebestible;

	public Crema(Bebestible bebestible) {
		this.bebestible = bebestible;
	}

	public Double costo() {
		return Double.valueOf(500) + bebestible.costo();
	}

	@Override
	public String getDescripcion() {
		return bebestible.getDescripcion() + ", Crema";
	}

}