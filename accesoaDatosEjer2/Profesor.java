package accesoaDatosEjer2;

import java.util.Scanner;

public class Profesor extends Personas {
	
	private boolean esTutor;
	private int cantidadAsignaturas;
	
	
	public boolean getEsTutor() {
		return esTutor;
	}
	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}
	
	public int getCantidadAsignaturas() {
		return cantidadAsignaturas;
	}
	public void setCantidadAsignaturas(int cantidadAsignaturas) {
		this.cantidadAsignaturas = cantidadAsignaturas;
	}
	
	public void crearPersona(Scanner sc) {
		char comprobacion;
		sc.nextLine();
		System.out.println("Nombre del profesor: ");
		setNombre(sc.nextLine());
		System.out.println("Apellido del profesor: ");
		setApellido(sc.nextLine());
		System.out.println("Telefono del profesor: ");
		setTelefono(sc.nextLine());
		System.out.println("Dni del profesor: ");
		setDni(sc.nextLine());
		System.out.println("Es tutor? ");
		comprobacion=sc.nextLine().charAt(0);
		if(comprobacion=='s') {
			setEsTutor(true);
		}else {
			setEsTutor(false);
		}
		System.out.println("Cantidad de asignaturas dadas: ");
		setCantidadAsignaturas(sc.nextInt());
	}
	
	public void darInfo() {
		String tuto="";
		if (esTutor) {
			tuto="Si es";
		}else {
			tuto="No es";
		}
		
		System.out.println("Nombre del profesor: "+getNombre());
		System.out.println("Apellido del profesor: "+getApellido());
		System.out.println("Telefono del profesor: "+getTelefono());
		System.out.println("Dni del profesor: "+getDni());
		System.out.println("Cantidad de asignaturas: "+getCantidadAsignaturas());
		System.out.println("Es tutor: "+tuto);
		System.out.println();
	}
	
}
