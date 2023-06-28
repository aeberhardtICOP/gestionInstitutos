package entidades;

public class Profesor extends Empleado implements Civil {
public Departamento depto;

public Profesor() {
	super();
}


public Profesor(String nombre, String apellido, estadoCivil estCivil, int dni, int añoIncorp, Departamento depto) {
	super(nombre, apellido, estCivil, dni, añoIncorp);
	this.depto = depto;
}


public Profesor(Departamento depto) {
	super();
	this.depto = depto;
}
public void mostrar() {
	super.mostrar();
	depto.mostrar();
}

public Departamento getDepto() {
	return depto;
}

public void setDepto(Departamento depto) {
	this.depto = depto;
}
@Override
public void modificarEstado() {
	super.modificarEstado();
	System.out.println("Profesor:");
	System.out.println("Depto: "+this.depto.getNombre());
}

}

