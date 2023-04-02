package edu.ucjc.programacion.pec1.marcos_sanchez;

public class Aula {
	
	private int numero;
    private int planta;
    private int asientos;
	
    // Generamos el constructor.
    public Aula(int numero, int planta, int asientos) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.asientos = asientos;
	}
    
    // Generamos los getters y setters.
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
}
