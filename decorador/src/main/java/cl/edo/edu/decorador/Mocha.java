package cl.edo.edu.decorador;

/**
 * Es un condimento
 */

public class Mocha extends DecoradorCondimentos {

	Bebestible bebestible;

	public Mocha(Bebestible bebestible) {
		this.bebestible = bebestible;
	}

	public Double costo() {
		return Double.valueOf(200) + bebestible.costo();
	}

	@Override
	public String getDescripcion() {
		return bebestible.getDescripcion() + ", Mocha";
	}

}
