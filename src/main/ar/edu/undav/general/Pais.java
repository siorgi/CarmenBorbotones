package ar.edu.undav.general;

import java.util.ArrayList;
import java.util.List;

import ar.edu.undav.lugaresDeInteres.LugarInteres;


/**
 * @author crist
 * La lista de String para las conexiones es para que el detective le pregunte al paisActual las conexiones,
 * al devolverle el string con el nombre del pais. al elegi viajarA, busca ese String (nombre del pais) en el 
 * mapamundi
 */
public class Pais {
	
	private String nombre;
	private List<String> caractetisticas;
	private List<LugarInteres> lugarInteres;
	private List<String> conexiones;
	
	//Constructor
	public Pais(String nombre, List<String> caracteristicas, List<LugarInteres> lugaresInteres, List<String> conexiones) {
		this.nombre= nombre;
		this.caractetisticas= caracteristicas;
		this.conexiones= conexiones;
		this.lugarInteres= lugaresInteres;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<LugarInteres> getLugarInteres() {
		return this.lugarInteres;
	}
	
	public List<Pais> getConexiones(){
		return this.conexiones;
	}
	
	public void agregarConexion(Pais pais) {
		this.conexiones.add(pais);
	}
	
	public void agregarConexiones(List<Pais>paises) {
		this.conexiones.addAll(conexiones);
	}

}
