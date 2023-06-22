package entidades;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Scanner;

import java.util.ArrayList;

public class Instituto {
private String nombre;
private String direccion;
private HashMap<Curso, Integer>cursos;
private ArrayList<Persona>personas;
private ArrayList<Departamento>deptos;

public Instituto() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("----------------------------- ");
	System.out.println("| Registrar nuevo instituto |");
	System.out.println("----------------------------- ");
	System.out.print("Ingrese Nombre del instituto: ");
	this.nombre=scanner.nextLine();
	System.out.print("Ingrese Direccion: ");
	this.direccion=scanner.nextLine();
	this.personas=new ArrayList();
	this.cursos=new HashMap();
	this.deptos=new ArrayList();
}

public Instituto(String nombre, String direccion) {
	this.nombre = nombre;
	this.direccion = direccion;
	this.personas=new ArrayList();
	this.cursos=new HashMap();
	this.deptos=new ArrayList();

}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public void agregarPersona(Persona persona) {
	this.personas.add(persona);
}
public void agregarCurso(Curso curso, int num ) { //que recibe como parametro a parte de curso??
	this.cursos.put(curso, num);
}
public void agragrDepto(Departamento depto) {
	this.deptos.add(depto);
}

public HashMap<Curso, Integer> getCursos() {
	return cursos;
}

public void setCursos(HashMap<Curso, Integer> cursos) {
	this.cursos = cursos;
}



}
