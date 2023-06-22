package entidades;
import java.util.Scanner;
import entidades.*;
public class Curso {
private String nombre;

public Curso() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("-------------------------- ");
	System.out.println("| Registrar nuevo curso: |");
	System.out.println("-------------------------- ");
	System.out.println("Ingrese nombre de curso: ");
	this.nombre=scanner.nextLine();
	
}
public Curso(String nombre) {
	this.nombre = nombre;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
//preguntar como agregar el curso a hashmap de instituto
public void mostrar(){
	System.out.println(this.nombre);
}
}
