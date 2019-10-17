package ar.edu.undav.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.undav.general.Pais;
import ar.edu.undav.lugaresDeInteres.Biblioteca;
import ar.edu.undav.lugaresDeInteres.Club;
import ar.edu.undav.lugaresDeInteres.Embajada;
import ar.edu.undav.lugaresDeInteres.LugarInteres;

class PaisTest {

	@Test
	void creoElPaisArgentina() {
		//caracteristicas del pais
		List<String> caracteristicas=new ArrayList<String>();
		caracteristicas.add("Bandera celeste y blanca");
		caracteristicas.add("Bandera con un sol");
		caracteristicas.add("Moneda Peso");
		caracteristicas.add("Casa de gobierno rosada");
		caracteristicas.add("Conocida por los Gauchos");
		caracteristicas.add("Comida típica empanadas");
		caracteristicas.add("Toman mate");
		
		//lugares de interes
		List<LugarInteres> lugarInteres = new ArrayList<LugarInteres>();
		lugarInteres.add(new Embajada());
		lugarInteres.add(new Biblioteca());
		lugarInteres.add(new Club());
		
		//conexiones
		List<String> conexiones= new ArrayList<String>();
		conexiones.add("Peru");
		conexiones.add("España");
		conexiones.add("Brasil");
		
		Pais argentina = new Pais("Argentina", caracteristicas,lugarInteres,conexiones);
		Assert.assertEquals("Argentina", argentina.getNombre());
	}


}
