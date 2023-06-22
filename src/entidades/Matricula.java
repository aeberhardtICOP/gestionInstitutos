package entidades;
import java.util.ArrayList;

public class Matricula {
private int idCurso;
private ArrayList<Alumno>alumnos;
private int año;


public Matricula(int idCurso, int año) {
	super();
	this.idCurso = idCurso;
	this.año = año;
	alumnos= new ArrayList();
}
public void agregarAlumno(Alumno alumno) {
	alumnos.add(alumno);
}
public void mostrar() {
	System.out.println("Año: "+this.año);
	for (int i=0;i<alumnos.size();i++) {
		System.out.println((alumnos.get(i)).getNombre()+" "+(alumnos.get(i).getApellido())+", ");
	}
	System.out.println();
}

public int getIdCurso() {
	return idCurso;
}
public void setIdCurso(int idCurso) {
	this.idCurso = idCurso;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}




}
