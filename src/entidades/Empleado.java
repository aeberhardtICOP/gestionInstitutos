package entidades;
import java.util.Scanner;
public class Empleado extends Persona {
//private boolean esActivo=true;
private static int nro=1;
private int nroLegajo;
private int añoIncorp;
public Empleado() {
	super();
	Scanner scanner = new Scanner(System.in);
	System.out.println("----------------------- ");
	System.out.println("| Registrar empleado: |");
	System.out.println("----------------------- ");
	System.out.println("Ingresar año de incorporacion: ");
	this.añoIncorp=scanner.nextInt();
	this.nroLegajo=nro++;
	
}
public Empleado(int añoIncorp) {
	super();
	this.nroLegajo = nro++;
	this.añoIncorp = añoIncorp;
}
public int getNroLegajo() {
	return nroLegajo;
}
public void setNroLegajo(int nroLegajo) {
	this.nroLegajo = nroLegajo;
}
public int getAñoIncorp() {
	return añoIncorp;
}
public void setAñoIncorp(int añoIncorp) {
	this.añoIncorp = añoIncorp;
}


}
