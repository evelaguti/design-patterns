package cl.edo.edu.decorador;

public class Main {
	public static void main(String[] ar) {
		System.out.println("Hagamos Café");

		Bebestible cafe = new Expresso();
		cafe = new Mocha(cafe);
		cafe = new Soya(cafe);
		cafe = new Crema(cafe);

		System.out.println("1er Café");
		System.out.println(cafe.getDescripcion() + " $ " + cafe.costo());

		cafe = new Descafeinado();
		cafe = new Mocha(cafe);
		cafe = new Soya(cafe);
		cafe = new Crema(cafe);

		System.out.println("2do Café");
		System.out.println(cafe.getDescripcion() + " $ " + cafe.costo());

		cafe = new CafeCasa();
		cafe = new Mocha(cafe);
		cafe = new Soya(cafe);
		cafe = new Crema(cafe);

		System.out.println("3er Café");
		System.out.println(cafe.getDescripcion() + " $ " + cafe.costo());

	}
}