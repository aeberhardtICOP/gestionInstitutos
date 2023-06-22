package entidades;
import java.util.Scanner;
public class Departamento {
private String nombre;

public Departamento() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("--------------------------------- ");
	System.out.println("| Registrar nuevo departamento: |");
	System.out.println("--------------------------------- ");
	System.out.println("Ingrese Nombre: ");
	this.nombre=scanner.nextLine();
}
public Departamento(String nombre) {
	this.nombre = nombre;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
