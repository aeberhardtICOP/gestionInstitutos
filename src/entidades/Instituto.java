package entidades;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

import java.util.ArrayList;
import java.util.Scanner;
public class Instituto {
private String nombre;
private String direccion;
private HashMap<Integer, Curso>cursos;
private ArrayList<Persona>personas;
private ArrayList<Departamento>deptos;
private ArrayList<Seccion>secciones;
private ArrayList<Matricula>gruposDeCursado;

Scanner scanner = new Scanner(System.in);
public Instituto() {
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
	this.secciones=new ArrayList();
	this.gruposDeCursado=new ArrayList();
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
public void agregarPersona() {
	System.out.println("Ingrese opcion:" );
	System.out.println("1)Agregar Alumno"
			+"\n2)Agregar Profesor"
			+"\n3)Agregar Empleado De Servicio");
	int op = scanner.nextInt();
	switch(op) {
	case 1: 
		Alumno alumno = new Alumno();
		this.personas.add(alumno);
		break;
	case 2:
		System.out.println("Los departamentos son: ");
		for(int i = 0; i<deptos.size();i++) {
			System.out.print(i+")"+(deptos.get(i)).getNombre()+", ");
		}
		System.out.println("Ingrese el nro del departamento que desea vincular: ");
		int nro = scanner.nextInt();
		for(int i = 0; i<deptos.size();i++) { 
			if (nro == i) {
			Profesor profesor = new Profesor(deptos.get(i));
			personas.add(profesor);
			}
		}
		break;
	case 3: 
		System.out.println("Las secciones son: ");
		for(int i = 0; i<secciones.size();i++) {
			System.out.print(i+")"+(secciones.get(i)).getNombre()+", ");
		}
		System.out.println("Ingrese el nro de la seccion que desea vincular: ");
		int num = scanner.nextInt();
		for(int i = 0; i<deptos.size();i++) { 
			if (num == i) {
			DeServicio servicio = new DeServicio(secciones.get(i));
			personas.add(servicio);
			}
		}
		break;
		default:
			System.out.println("No ingreso una opcion correcta.");
	}
}
//CURSOS
public void cargarCurso() {
	Curso curso = new Curso();
	agregarCurso(curso);
}
public void agregarCurso(Curso curso) { 
	this.cursos.put(curso.getIdCurso(), curso);
}
public void mostrarCursos() {
for (Map.Entry<Integer, Curso> entry : cursos.entrySet()) {
	Curso curso=entry.getValue();
	int idCurso=entry.getKey();
	System.out.print("ID: "+idCurso+" CURSO:"+ curso.getNombre()+"\n");
}	
System.out.println();
}
public void matricularAlumnoCurso(Alumno alumno) {
	String nombre=null;
	System.out.println("Cursos disponibles: ");
	for (int i=0;i<gruposDeCursado.size();i++) {
		int id = gruposDeCursado.get(i).getIdCurso();
		System.out.print(i+")ID: "+id);
		for(Map.Entry<Integer, Curso> entry : cursos.entrySet()) {
			if(entry.getKey().equals(id)) {
				nombre=entry.getValue().getNombre();
			}
		}
		System.out.print(" NOMBRE: "+nombre + " AÑO: "+gruposDeCursado.get(i).getAño());
		System.out.println();
	}
	System.out.println("Ingrese nro de curso al que desea matricularse: ");
	int indiceGC=scanner.nextInt();
	if(indiceGC < gruposDeCursado.size()) {
		alumno.matricularCurso(gruposDeCursado.get(indiceGC));
		gruposDeCursado.get(indiceGC).agregarAlumno(alumno);
	}
	
}
public void agragrDepto(Departamento depto) {
	this.deptos.add(depto);
}
public void agregarMatricula(Matricula matricula) {
	this.gruposDeCursado.add(matricula);
}
public void agregarSeccion(Seccion seccion) {
	this.secciones.add(seccion);
}
public void mostrarPersonas() {
	for (int i=0;i<personas.size();i++) {
		personas.get(i).mostrar();
	}
}

//public HashMap<Curso, Integer> getCursos() {
//	return cursos;
//}
//
//public void setCursos(HashMap<Curso, Integer> cursos) {
//	this.cursos = cursos;
//}



}
