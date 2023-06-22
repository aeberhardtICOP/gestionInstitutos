package entidades;

public class Seccion {
private String nombre;

public Seccion() {
	super();
}

public Seccion(String nombre) {
	super();
	this.nombre = nombre;
}
public void mostrar() {
	System.out.println("Nombre de seccion: "+this.nombre);
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
