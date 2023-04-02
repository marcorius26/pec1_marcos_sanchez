package edu.ucjc.programacion.pec1.marcos_sanchez;

import java.util.Scanner;

public class UtilsColegio {
	
	// Método que crea todos los alumnos, preguntando su nombre, apellidos y DNI.
	public static Alumno[] nombrarAlumnos(int numAlumnos) {
		Scanner scan = new Scanner(System.in);
        Alumno[] alumnos = new Alumno[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduce el nombre del alumno " + (i + 1));
            String nombre = scan.nextLine();
            System.out.println("Introduce los apellidos del alumno " + (i + 1));
            String apellidos = scan.nextLine();
            System.out.println("Introdude el DNI del alumno " + (i + 1));
            String dni = scan.nextLine();
            alumnos[i] = new Alumno(nombre, apellidos, dni);
        }
        return alumnos;
        
		
		
	}
	



}
