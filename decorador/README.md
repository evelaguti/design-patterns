
# Decorator

## Tambien conocido como
Wrapper

## Intención
Agregar nuevas responsabilidades a un objeto de manera dinámica, los decoradores proveen una alternativa flexible de heredar para obtener funcionalidad.

## Explicación

#### Ejemplo Real

> Hay una cafetería en donde se necesita llevar cuenta de los costos asociados al agregar nuevos condimentos al café. 

#### En pocas palabras

>El patron decorador te da la posibilidad de cambiar el comportamiento del objeto en caliente envolviendolo en un objeto decorativo

#### Wikipedia dice

> En la programación orientada a objetos, el patrón de decorador es un patrón de diseño que permite que el comportamiento se agregue a un objeto individual, ya sea estática o dinámicamente, sin afectar el comportamiento de otros objetos de la misma clase. El patrón decorador es a menudo útil para cumplir con el Principio de Responsabilidad Individual, ya que permite que la funcionalidad se divida entre clases con áreas de preocupación únicas.

**Ejemplo**

Hagamos el ejemplo de la cafetería para entender a fondo éste patrón

```java
public interface Finanzas {
	public Double costo();
}

public abstract class Bebestible implements Finanzas {
	String descripcion = "Brebaje desconocido";

	public String getDescripcion() {
		return descripcion;
	}

}
// Clase responsable de la decoración
public abstract class DecoradorCondimentos extends Bebestible {
	public abstract String getDescripcion();
}

```
Ahora creamos un café al cual extenderemos de Bebestible

```java
public class Expresso extends Bebestible {

	public Expresso() {
		descripcion = "Expresso";
	}

	public Double costo() {
		return Double.valueOf(1800);
	}

}
```
Luego creamos condimentos que extiendan de nuestra clase abstracta DecoradorCondimentos.
```java
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

public class Soya extends DecoradorCondimentos {

	Bebestible bebestible;

	public Soya(Bebestible bebestible) {
		this.bebestible = bebestible;
	}

	public Double costo() {
		return Double.valueOf(500) + bebestible.costo();
	}

	@Override
	public String getDescripcion() {
		return bebestible.getDescripcion() + ", Leche de Soya";
	}

}

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
```

Finalmente nos preparamos a hacer café con las siguientes lineas.

```java
// Café expresso
Bebestible cafe = new Expresso();
// Agregando mocha
cafe = new Mocha(cafe);
// Agregando soya
cafe = new Soya(cafe);
// Agregando crema
cafe = new Crema(cafe);

// Imprimiendo tipo y precio total del café
System.out.println(cafe.getDescripcion() + " $ " + cafe.costo()));
// Expresso, Mocha, Leche de Soya, Crema $ 3000.0
```

## Posibles Aplicaciones.

* Para agregar responsabilidades a objetos individuales de forma dinámica y transparente, es decir, sin afectar a otros objetos
* Para las responsabilidades que pueden ser retiradas
* Cuando la extensión mediante subclases no es práctica. En ocasiones, es posible un gran número de extensiones independientes y produciría una explosión de subclases para admitir todas las combinaciones. O una definición de clase puede estar oculta o no estar disponible para subclases

## Creditos

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Functional Programming in Java: Harnessing the Power of Java 8 Lambda Expressions](http://www.amazon.com/Functional-Programming-Java-Harnessing-Expressions/dp/1937785467/ref=sr_1_1)
* [J2EE Design Patterns](http://www.amazon.com/J2EE-Design-Patterns-William-Crawford/dp/0596004273/ref=sr_1_2)
