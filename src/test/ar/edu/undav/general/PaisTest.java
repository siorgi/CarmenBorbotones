package ar.edu.undav.general;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class PaisTest {

	@Test
	void CrearPaisNuevoCompletoYRevisarLasConexiones() {
		
		List<String> caracteristicas=new ArrayList<String>();
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		
		List<String> conexiones = new ArrayList<String>();
		conexiones.add("Uruguay");
		conexiones.add("Alemania");
		
		Pais pais1= new Pais("Argentina",caracteristicas,conexiones);
		
		Assert.assertTrue(pais1.getConexiones().contains("Uruguay"));
		Assert.assertTrue(pais1.getConexiones().contains("Alemania"));
		
	}

	@Test
	void CrearPaisNuevoYRevisarQueSuNombreSeaElCorrecto() {
		
		List<String> caracteristicas=new ArrayList<String>();
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		
		List<String> conexiones = new ArrayList<String>();
		conexiones.add("Uruguay");
		conexiones.add("Alemania");
		
		Pais pais1= new Pais("Argentina",caracteristicas,conexiones);
		
		Assert.assertEquals("Argentina", pais1.getNombre());
	}

	@Test
	void testGetLugarInteres() {
		fail("Not yet implemented");
	}



}
