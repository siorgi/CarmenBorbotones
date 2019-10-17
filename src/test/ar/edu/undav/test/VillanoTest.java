package ar.edu.undav.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Assert; 

import java.util.ArrayList;
import java.util.List;

import ar.edu.undav.general.Villano;

public class VillanoTest {
	
	@Test
	public void creamosElVillanoSabriYObtenemosSuNombre() {
		//creamos las senias para el villano
		List<String> senias= new ArrayList<String>();
		senias.add("Pelo Negro");
		senias.add("Tiene una Ferrari");
		senias.add("Tiene anillo de plastico");
		senias.add("Vive a Birras");
		
		//creamos los hobbies para el villano
		List<String> hobbies= new ArrayList<String>();
		hobbies.add("Tomar birra");
		hobbies.add("Tomar birra 2");
		
		Villano sabri =  new Villano("Sabri", 'F', senias, hobbies);
		
		assertEquals("Sabri", sabri.getNombre());
	}

}
