package entidades;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map.Entry;
public class Alumno extends Persona {
private ArrayList<Curso>cursos;

public Alumno() {
	super();
	this.cursos=new ArrayList();
	
}

public Alumno(String nombre, String apellido, estadoCivil estCivil) {
	super(nombre, apellido, estCivil);
	this.cursos=new ArrayList();
}
public void mostrarCursos(){
	System.out.println("Cursos que asiste: ");
	for(int i = 0; i<this.cursos.size();i++) {
		cursos.get(i).mostrar();
	}
}
}
