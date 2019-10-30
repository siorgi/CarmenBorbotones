package ar.edu.undav.general;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Caso {
	
	private Villano villano;
	private List<String> planEscape;
	private String reporte;
	private String objeto;
	private Pais paisDelCrimen;
	private int cantidadOrdenesDeArresto;
	private int cantidadDeOrdenesPermitido=1; // limite de ordenes permitidas de arresto
	private List<Villano> villanos;
        
        
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
        
        
        public Set<String> seniasPelo(){
            Set<String> senias = new HashSet<String>();
            senias.add("Pelo Rubio");
            senias.add("Pelo Negro");
            senias.add("Pelo Rojo");
            senias.add("Pelo Violeta");
            return senias;
        }
        
        public Set<String> seniasFisicas(){
            Set<String> senias = new HashSet<String>();
            senias.add("Posee Tatuaje en el brazo");
            senias.add("Posee Tatuaje en la pierna");
            senias.add("Mide mas de 1.80");
            senias.add("Mide menos de 1.50");
            senias.add("Usa Lentes");
            senias.add("Tiene pata de palo");
            return senias;
        }
        
        
        public Set<String> seniasHabilidad(){
            Set<String> senias = new HashSet<String>();
            senias.add("Habla Ucraniano");
            senias.add("Maneja Limusina");
            senias.add("Usa Sombrero");
            senias.add("Pilotea avion");
            senias.add("Habla Español");
            senias.add("Usa baston");
            return senias;
        }
        
        
        public Set<String> Hobbies(){
            Set<String> hobbies = new HashSet<String>();
            hobbies.add("Juega al Futbol");
            hobbies.add("Cocina");
            hobbies.add("Natacion");
            hobbies.add("Juaga Ajedres");
            hobbies.add("Toma Cafe");
            hobbies.add("Mira Television");
            return hobbies;
        }
        
        
	
	
}
