package edu.ucjc.programacion.pec1.marcos_sanchez;

public class GestionColegios {
	
	//Link al repositorio de GitHub.
	//https://github.com/marcorius26/pec1_marcos_sanchez.git

	public static void main(String[] args) {
		
		Aula aula1 = new Aula(3,3,3);		
		Aula [] aulas1 = {aula1};
		
		// Objeto de tipo colegio que la informacion del nombre, su dirección, el número de aulas y alumnos.
		Colegio colegio1 = new Colegio("Federico García Lorca","Calle Marqués de Valdavia 91",aulas1);
		
		int numAlumnos = 2;
		
		
		Alumno[] alumnos = UtilsColegio.nombrarAlumnos(numAlumnos);
	}
}
