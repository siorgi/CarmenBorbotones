package ar.edu.undav.general;

import ar.edu.undav.lugaresDeInteres.Banco;
import ar.edu.undav.lugaresDeInteres.Biblioteca;
import ar.edu.undav.lugaresDeInteres.Club;
import ar.edu.undav.lugaresDeInteres.Embajada;
import java.util.ArrayList;
import java.util.List;
import ar.edu.undav.lugaresDeInteres.LugarInteres;
import java.util.Random;
import java.util.Set;

public class Pais {
	
	private String nombre;
	private List<String> caractetisticas;
	private List<LugarInteres> lugarInteres;
        private Set<Integer> sorteos;
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
                this.crearLugarDeInteres(3);                
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
        
	private void generarSorteos(int cantSorteos){           
            Random random = new Random();
            while (sorteos.size()<cantSorteos) {
                int numero = random.nextInt(4);
                if (!sorteos.contains(numero)){                
                    sorteos.add(numero);
                }
            }            
        }
        
        private void crearLugarDeInteres(int opcion){
            LugarInteres nuevoLugarInteres;
            switch (opcion){
                case 0: nuevoLugarInteres = new Banco();
                case 1: nuevoLugarInteres = new Biblioteca();
                case 2: nuevoLugarInteres = new Club();
                case 3: nuevoLugarInteres = new Embajada();                
            }
        }
        
        
        
        private void crearLugaresDeInteres(int cantLugares){
            this.generarSorteos(cantLugares);
            sorteos.forEach(sorteo -> this.crearLugarDeInteres(sorteo));            
        }
        
        
        
}
