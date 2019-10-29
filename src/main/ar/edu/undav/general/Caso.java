package ar.edu.undav.general;

import java.util.List;

public class Caso {
	
	private Villano villano;
	private List<String> planEscape;
	private String reporte;
	private String objeto;
	private Pais paisDelCrimen;
	private int cantidadOrdenesDeArresto;
	private int cantidadDeOrdenesPermitido=1; // limite de ordenes permitidas de arresto
	
	//Constructor
	public Caso(Villano villano, List<String> planEscape, String reporte, String objeto, Pais paisDelCrimen) {
		this.villano = villano;
		this.planEscape = planEscape;
		this.reporte = reporte;
		this.objeto = objeto;
		this.paisDelCrimen = paisDelCrimen;
		cantidadOrdenesDeArresto=0;
	}
	
	public Pais PaisDelCrimen() {
		return this.paisDelCrimen;
	}

	public boolean ArrestarA(Villano villano) {
		if( cantidadOrdenesDeArresto < cantidadDeOrdenesPermitido && this.villano.equals(villano)) {
			return true;
		}
		else {
			return false;
		}
	}


	
	
	
	
}
