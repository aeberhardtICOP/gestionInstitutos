package entidades;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map.Entry;
public class Alumno extends Persona implements Civil{
private ArrayList<Matricula>cursos;

public Alumno() {
	super();
	this.cursos=new ArrayList();
}
public Alumno(String nombre, String apellido, estadoCivil estCivil,int dni) {
	super(nombre, apellido, estCivil, dni);
	this.cursos=new ArrayList();
}
public void matricularCurso(Matricula matricula) {
	this.cursos.add(matricula);
}
public void mostrar() {
	super.mostrar();
	System.out.println("Cursos: ");
	mostrarCursos();
}
public void mostrarCursos(){
	for(int i = 0; i<this.cursos.size();i++) {
		cursos.get(i).mostrar();
	}
}
@Override
public void modificarEstado(){
	super.modificarEstado();
	System.out.println("Alumno");
	for(int i=0;i<cursos.size();i++) {
		System.out.print(cursos.get(i).getCurso().getNombre()+", ");
	}
	System.out.println();
}
}
