package edu.ucjc.programacion.pec1.marcos_sanchez;

public class Colegio {
	
	private String nombre;
    private String direccion;
    private Aula[] aulas;
	
    // Generamos el constructor.
    public Colegio(String nombre, String direccion, Aula[] aulas) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = aulas;
	}

    // Generamos los getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public Aula[] getAulas() {
		return aulas;
	}

	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
    
	// Metodo que asignará al alumno al asiento libre dentro de cualquiera de las aulas.
	// Si ya estan todos los asintos asignados, devolverá que no tiene asiento disponible.
    public void asignarAsientos(Alumno alumno) {
    	for (Aula aula : aulas) {
            if (aula.getAsientos() > 0) {
            	aula.setAsientos(aula.getAsientos() - 1);
            	System.out.println("El alumno con nombre " + alumno.getNombre()
            			+ " con el DNI " + alumno.getDni() + "tiene el asiento Nº "
            			+ aula.getAsientos() + " en el aula "+ aula.getNumero());        	
            } else {
            	System.out.println("El alumno con nombre" + alumno.getNombre() +
            			" con el DNI " + alumno.getDni() + "no tiene asiento porque no queda ningun sitio libre");
            }
    	}  	
    }
    
    
    
    
    
 
   


}
