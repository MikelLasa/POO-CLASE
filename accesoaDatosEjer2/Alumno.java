package accesoaDatosEjer2;
import java.util.Scanner;

public class Alumno extends Personas {
	
private int curso;
private double nota;

public int getCurso() {
	return curso;
}
public void setCurso(int curso) {
	this.curso = curso;
}

public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}

public void crearPersona(Scanner sc) {
	sc.nextLine();
	System.out.println("Nombre del alumno: ");
	setNombre(sc.nextLine());
	System.out.println("Apellido del alumno: ");
	setApellido(sc.nextLine());
	System.out.println("Telefono del alumno: ");
	setTelefono(sc.nextLine());
	System.out.println("Dni del alumno: ");
	setDni(sc.nextLine());
	do {
		System.out.println("Curso del alumno: ");
		setCurso(sc.nextInt());
	}while(getCurso()>2 && getCurso()<0);
	do {
		System.out.println("Nota del alumno: ");
		setNota(sc.nextDouble());
	}while(getNota()>10 && getNota()<0);

}

public void darInfo() {
	System.out.println("Nombre del alumno: "+getNombre());
	System.out.println("Apellido del alumno: "+getApellido());
	System.out.println("Telefono del alumno: "+getTelefono());
	System.out.println("Dni del alumno: "+getDni());
	System.out.println("Curso del alumno 1 o 2: "+curso);
	System.out.println("Nota del alumno: "+nota);
	System.out.println();
}

}
