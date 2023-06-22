package entidades;
import java.util.Scanner;
enum estadoCivil{SOLTERO, CASADO, VIUDO, DIVORCIADO}
public class Persona {
private static int num=1;
private String nombre;
private String apellido;
private int numId;
private estadoCivil estado;

public Persona() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("--------------------------- ");
	System.out.println("| Registrar nueva persona |");
	System.out.println("--------------------------- ");
	System.out.print("Ingrese Apelido: ");
	this.apellido=scanner.nextLine();
	System.out.print("Ingrese Nombre: ");
	this.nombre=scanner.nextLine();
	this.numId=num+1;
	System.out.println("Ingrese estado civil: {SOLTERO, CASADO, VIUDO, DIVORCIADO}");
	//preguntar por restriccion de enum.
	String eCivil=scanner.nextLine();
	if(eCivil.toUpperCase()=="SOLTERO" || eCivil.toUpperCase()=="CASADO" || eCivil.toUpperCase()=="VIUDO" || eCivil.toUpperCase() == "DIVORCIADO") {
		this.estado=estadoCivil.valueOf(eCivil.toUpperCase());
	}else {
		this.estado=null;
	}
}
public Persona(String nombre, String apellido, estadoCivil estCivil) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.estado=estCivil;
	this.numId=num+1;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public estadoCivil getEstado() {
	return estado;
}
public void setEstado(String eCivil) {
	if(eCivil.toUpperCase()=="SOLTERO" || eCivil.toUpperCase()=="CASADO" || eCivil.toUpperCase()=="VIUDO" || eCivil.toUpperCase() == "DIVORCIADO") {
		this.estado=estadoCivil.valueOf(eCivil.toUpperCase());
	}else {
		this.estado=null;
	}
}


}
