package practica;

import java.util.ArrayList;

public class Profesor extends Persona {
private double sueldo;
private double sueldoBasico;
private int antiguadad;
private String titulo;
private ArrayList<String>listaDeMaterias;

//constructores

public Profesor(int dni, String nombre, String apellido, int edad, String direccion, double sueldo, double sueldoBasico,
		int antiguadad, String titulo, ArrayList<String> listaDeMaterias) {
	super(dni, nombre, apellido, edad, direccion);
	this.sueldo = sueldo;
	this.sueldoBasico = sueldoBasico;
	this.antiguadad = antiguadad;
	this.titulo = titulo;
	this.listaDeMaterias = listaDeMaterias;
}

public Profesor() {
	
}
//Set Y Get
public double getSueldo() {
	return sueldo;
}

public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}

public double getSueldoBasico() {
	return sueldoBasico;
}

public void setSueldoBasico(double sueldoBasico) {
	this.sueldoBasico = sueldoBasico;
}

public int getAntiguadad() {
	return antiguadad;
}

public void setAntiguadad(int antiguadad) {
	this.antiguadad = antiguadad;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public ArrayList<String> getListaDeMaterias() {
	return listaDeMaterias;
}

public void setListaDeMaterias(ArrayList<String> listaDeMaterias) {
	this.listaDeMaterias = listaDeMaterias;
}
//metodos que creamos nosotros 
public double calcularSueldo()
{   
	switch (this.antiguadad) {
		case 1:
			this.sueldo = this.sueldoBasico;
			break;
		case 2:
			 this.sueldo = (this.sueldoBasico*1.10);
		case 3:
			 this.sueldo = (this.sueldoBasico*1.15);
		case 4:
			 this.sueldo = (this.sueldoBasico*1.20);
		case 5:
			 this.sueldo = (this.sueldoBasico*1.25);	 	 	 		
	
		default:
			this.sueldo = 0.0;
			break;
	}
	return sueldo; //creo que ya esta
};
public int informarCantMaterias() {
	return this.listaDeMaterias.size();
}
public void agregarMateria(String materia) {
	this.listaDeMaterias.add(materia);
}
public String enseniar() {
	return "Dando clases";
}
//to String

@Override
public String toString() {
	return "Profesor [sueldo=" + sueldo + ", sueldoBasico=" + sueldoBasico + ", antiguadad=" + antiguadad + ", titulo="
			+ titulo + "]";
}



}
