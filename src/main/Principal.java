package main;
import entidades.*;
import java.util.Scanner;
public class Principal {
private static String eleccion="";
	
	private static void mostrarMenu()
	{
		System.out.println("Menu: ");
		System.out.println("1: Agregar persona");
		System.out.println("2: Cambiar estado civil de persona");
		System.out.println("3: Reasignar legajo de empleado");
		System.out.println("4: Matricular alumno a curso");
		System.out.println("5: Alta de curso");
		System.out.println("6: Cambio de departamento de Profesor");
		System.out.println("7: Cambio de seccion de un empleado de servicio");
		System.out.println("8: Mostrar personas de instituto");
		System.out.println("9: Mostrar informacion de Instituto");
		System.out.println("10: Mostrar cursos disponibles");
		System.out.println("11: Mostrar alumnos inscriptos a curso");
		System.out.println("12: Agregar seccion");
		System.out.println("13: Agregar grupo de cursado");
		
		System.out.println("q: Salir");	
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Opción: ");
		eleccion = scanner.nextLine();
	}
	public static void main(String[] args) {
		Instituto instituto = new Instituto();
		Departamento depto = new Departamento("DSW");
		Departamento depto2 = new Departamento("RRHH");
		Departamento depto3 = new Departamento("PUBLICIDAD");
		instituto.agragrDepto(depto);
		instituto.agragrDepto(depto2);
		instituto.agragrDepto(depto3);
		Seccion seccion = new Seccion("Secretaria");
		Seccion seccion2 = new Seccion("Mantenimiento");
		instituto.agregarSeccion(seccion);
		instituto.agregarSeccion(seccion2);
		Curso curso = new Curso("Ingenieria de software");
		Curso curso2 = new Curso("Redes y comunicacion");
		instituto.agregarCurso(curso2);
		instituto.agregarCurso(curso);
		Matricula matricula = new Matricula(curso,2022);
		Matricula matricula2 = new Matricula(curso,2023);
		instituto.agregarMatricula(matricula2);
		instituto.agregarMatricula(matricula);
		while (!eleccion.equals("q"))
		 {
			mostrarMenu();	
			switch (eleccion){
			case "1":
				System.out.println("Eligio la opcion 1 -> Agregar persona");
				System.out.println("");
				instituto.agregarPersona();
				break;
			case "2":
				System.out.println("Elegi la opcion 2 -> Cambiar estado civil de la persona");
				//FALTAAAA
				System.out.println("");
				break;
			case "3":
				System.out.println("Elegi la opcion 3 -> Reasignacion de legajo");
				instituto.reasigancionLegajo();
				System.out.println("");
				break;
			case "4":
				instituto.matricularAlumnoCurso();
				break;
			case "5":
				System.out.println("Eligio la opcion 5 -> Alta de curso");
				instituto.cargarCurso();
				break;
			case "6":
				System.out.println("Eligio la opcion 6 -> Cambiar departamento a profesor");
				//FALTAAAA
				break;
			case "7":
				System.out.println("Eligio la opcion 6 -> Cambiar seccion a empleado de servicio");
				//FALTAAA
				break;
			case "8":
				System.out.println("Eligió la opcion 8 -> Mostrar personas");
				instituto.mostrarPersonas();
				break;
			case "9":
				System.out.println("Eligió la opcion 9 -> Mostrar Informacion");
				instituto.motrar();
				break;
			case "10":
				System.out.println("Eligio la opcion 10 -> Mostrar cursos");
				instituto.mostrarCursos();
				break;
			case "11":
				System.out.println("Eligio la opcion 11 -> Mostrar alumnos inscriptos a cursos");
				//FALTAAA
				break;
			case "12":
				System.out.println("Eligio la opcion 12 -> Agregar seccion");
				//FALTAAAA
				break;
			case "13":
				System.out.println("Eligió la opcion 13 -> Agregar grupo de cursado");
				instituto.crearNuevoGrupo();
				break;
				
			case "q":
				System.out.println("Saliendo del sistema...");
				break;
				default:
					System.out.println("Ingreso opcion incorrecta.");
			}  
		}		
	}
//		Instituto Icop = new Instituto();
//		Seccion seccion = new Seccion("Secretaria");
//		Seccion seccion2 = new Seccion("Direccion");
//		Icop.agregarSeccion(seccion);
//		Icop.agregarSeccion(seccion2);
//		Departamento depto = new Departamento("DSW");
//		Departamento depto2 = new Departamento("RRHH");
//		Icop.agragrDepto(depto);
//		Icop.agragrDepto(depto2);
//		Icop.agregarPersona();
//		Icop.mostrarPersonas();

	}

