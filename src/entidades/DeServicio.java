package entidades;
import java.util.Scanner;
enum secciones {BIBLIOTECA , REGENCIA, SECRETARIA, ADMINISTRACION}
public class DeServicio extends Empleado {
private secciones Seccion;



public DeServicio() {
	super();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese estado Seccion: {BIBLIOTECA , REGENCIA, SECRETARIA, ADMINISTRACION}");
	//preguntar por restriccion de enum.
	String seccion=scanner.nextLine();
	if(seccion.toUpperCase()=="BIBLIOTECA" || seccion.toUpperCase()=="REGENCIA" || seccion.toUpperCase()=="SECRETARIA" || seccion.toUpperCase() == "ADMINISTRACION") {
		this.Seccion=secciones.valueOf(seccion.toUpperCase());
	}else {
		this.Seccion=null;
	}
}
public DeServicio(int añoIncorp, secciones seccion) {
	super(añoIncorp);
	Seccion = seccion;
}

}

