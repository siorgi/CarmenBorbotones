package ar.edu.undav.general;

import java.util.ArrayList;
import java.util.List;

import ar.edu.undav.lugaresDeInteres.LugarInteres;

public class Pais {
	
	private String nombre;
	private List<String> caractetisticas;
	private List<LugarInteres> lugarInteres;
	private List<String> conexiones;
	
	/*
	 * Cuando creas el primer pais es imposible ponerle conexiones porque no tenes
	 * pais para agregar por ende, se dan dos constructores para poder crear el primero o lo
	 * que sean necesarios y luego si un constructor que agregue una lista de conexiones
	 */
	
	//Constructor
	public Pais(String nombre, List<String>caracteristicas, List<String>conexiones) {
		this.nombre=nombre;
		this.caractetisticas= new ArrayList<String>();
		this.caractetisticas.addAll(caracteristicas);
		this.conexiones= new ArrayList<String>();
		this.conexiones.addAll(conexiones);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<LugarInteres> getLugarInteres() {
		return this.lugarInteres;
	}
	
	public List<String> getConexiones(){
		return this.conexiones;
	}
	

}
