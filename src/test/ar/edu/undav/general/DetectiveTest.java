package ar.edu.undav.general;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class DetectiveTest {


	@Test
	void testCasoNuevo() {
		fail("Not yet implemented");
	}

	@Test
	void testObtenerConexionesPaisActual() {
		fail("Not yet implemented");
	}

	@Test
	void CrearDetectiveDesdeCeroYPreguntarAMapaMundiSiPuedeViajarAUnaConexion() {
		MapaMundi mapa = new MapaMundi();
		
		List<String> caracteristicas=new ArrayList<String>();
		
		//Pais1
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		
		List<String> conexiones = new ArrayList<String>();
		conexiones.add("Uruguay");
		conexiones.add("Alemania");
		
		Pais argentina= new Pais("Argentina",caracteristicas,conexiones);
		
		//pais2
		caracteristicas.clear();
		conexiones. clear();
		
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		
		conexiones.add("Argentina");
		conexiones.add("Suecia");
		
		Pais uruguay= new Pais("Uruguay",caracteristicas,conexiones);

		//pais3
		caracteristicas.clear();
		conexiones. clear();
		
		caracteristicas.add("Comen embutidos");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		
		conexiones.add("Argentina");
		conexiones.add("Mexico");
		
		Pais alemania= new Pais("Alemania",caracteristicas,conexiones);
		
		mapa.AgregarPais(alemania);
		mapa.AgregarPais(uruguay);
		mapa.AgregarPais(argentina);
		
		//Villano
		
		List<String> senias = new ArrayList<String>();
		senias.add("Cicatriz");
		senias.add("Tatuaje en pierna izquierda");
		List<String> hobbies = new ArrayList<String>();
		hobbies.add("Juega a tenis");
		Villano alan = new Villano("Alan el malo",'m',senias,hobbies);
				
		//Caso
		List<String> planEscape = new ArrayList<String>();
		planEscape.add("Argentina");
		planEscape.add("Polonia");
		String reporte="Se robaron todo";
		String objeto="Cajon";
		Caso caso = new Caso(alan,planEscape,reporte,objeto,argentina);
		
		//detective
		Detective juan = new Detective(mapa);
		juan.CasoNuevo(caso);
		juan.ViajarA("Alemania");
		
		Assert.assertEquals("Alemania", juan.ObtenerPaisActual().getNombre());
		
		
	}

	@Test
	void testPedirOrdenDeArrestoA() {
		fail("Not yet implemented");
	}
	
	

}
