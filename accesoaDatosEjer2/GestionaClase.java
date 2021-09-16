package accesoaDatosEjer2;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionaClase {

	public static void main(String[] args) {
		ArrayList<Alumno> Alumno = new ArrayList<Alumno>();
		ArrayList<Profesor> Profesor = new ArrayList<Profesor>();
		menu(Alumno, Profesor);

	}

	public static void menu(ArrayList<Alumno> alumnos1, ArrayList<Profesor> profesores1) {
		Scanner sc=new Scanner(System.in);
		Alumno alumno = new Alumno();
		int eleccion;
		do {
			System.out.println("Introduce una de las opciones:");
			System.out.println("Crear alumno : pulsa 1");
			System.out.println("Crear profesor : pulsa 2");
			System.out.println("Mostrar informacion del alumno : pulsa 3");
			System.out.println("Mostrar informacion del profesor : pulsa 4");
			System.out.println("Mostrar cantidad de alumnos de 1º y 2º : pulsa 5");
			System.out.println("Mostrar porcentaje de alumnos aprobados por curso : pulsa 6");
			System.out.println("Mostrar el profesor con mas asignaturas y tutor : pulsa 7");
			System.out.println("Finalizar programa: pulsa otra tecla");

			eleccion=sc.nextInt();

			switch (eleccion) 
			{
			case 1:  Alumno a1=new Alumno();
			a1.crearPersona(sc);
			alumnos1.add(a1);

			break;
			case 2:  Profesor p1=new Profesor();
			p1.crearPersona(sc);
			profesores1.add(p1);

			break;
			case 3:  imprimirInfoAlumno(alumnos1);
			break;
			case 4:  imprimirInfoProfesor(profesores1);
			break;
			case 5:  cantidadAlumnos(alumnos1);
			break;
			case 6:  porcentajeAlumnosAprobados(alumnos1);
			break;
			case 7:  profesorAsignaturaTutor(profesores1);
			break;
			}
		}while(eleccion<8);
		System.out.println("Fin del programa");
	}


	public static void imprimirInfoAlumno(ArrayList<Alumno> alumnos1) {
		for(int i=0;i<alumnos1.size();i++) {
			alumnos1.get(i).darInfo();
		}
	}
	
	public static void imprimirInfoProfesor(ArrayList<Profesor> profesores1) {
		for(int i=0;i<profesores1.size();i++) {
		profesores1.get(i).darInfo();
		}
	}

	public static void cantidadAlumnos(ArrayList<Alumno> alumnos1) {
		int curso1=0;
		int curso2=0;
		for(int i=0;i<alumnos1.size();i++) {
			if(alumnos1.get(i).getCurso()==1) {
				curso1++;
			}else {
				curso2++;
			}
		}
		System.out.println("Alumnos del primer curso: "+curso1);
		System.out.println("Alumnos del segundo curso: "+curso2);

	}

	public static void porcentajeAlumnosAprobados(ArrayList<Alumno> alumnos1) {
		int aprobadoCurso1=0;
		int aprobadoCurso2=0;
		double porcentaje1;
		double porcentaje2;
		int nAlumnosCurso1=0;
		int nAlumnosCurso2=0;

		for(int i=0;i<alumnos1.size();i++) {
			if(alumnos1.get(i).getCurso()==1) {
				nAlumnosCurso1++;
			}
			if(alumnos1.get(i).getCurso()==2) {
				nAlumnosCurso2++;
			}
			if(alumnos1.get(i).getNota()>=5 && alumnos1.get(i).getCurso()==1) {
				aprobadoCurso1++;
			}
			if(alumnos1.get(i).getNota()>=5 && alumnos1.get(i).getCurso()==2) {
				aprobadoCurso2++;
			}
		}
		porcentaje1=aprobadoCurso1*100/nAlumnosCurso1;
		porcentaje2=aprobadoCurso2*100/nAlumnosCurso2;
		System.out.println("Porcentaje de aprobados del primer curso: "+porcentaje1);
		System.out.println("Porcentaje de aprobados del segundo curso: "+porcentaje2);
	}

	public static void profesorAsignaturaTutor(ArrayList<Profesor> profesores1) {
		int maxAsign=0;
		int localizarProfe=0;
		for(int i=0;i<profesores1.size();i++) {
			if(profesores1.get(i).getEsTutor()==true) {
				if(maxAsign<profesores1.get(i).getCantidadAsignaturas()) {
					maxAsign=profesores1.get(i).getCantidadAsignaturas();
					localizarProfe=i;
				}
			}
		}
		System.out.println("El profe con mas asignaturas y ademas es tutor es "+profesores1.get(localizarProfe).getNombre()+" "+profesores1.get(localizarProfe).getApellido());
	}

}


