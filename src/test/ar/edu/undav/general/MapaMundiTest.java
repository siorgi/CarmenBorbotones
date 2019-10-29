package ar.edu.undav.general;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

class MapaMundiTest {

	@Test
	void CrearMapaMundiYPreguntarPorUnNombreEnStringYDevuelvePaisCompletoSinError() {
		
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
		
		Pais paisPrueba = mapa.ObtenerPais("Argentina");
		
		Assert.assertEquals(argentina.getClass(), paisPrueba.getClass());
		
	}
	
	@Test
	void CrearMapaMundiNuevoYAgregarPaisesSactifactoriamente() {
		
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
		
		Assert.assertTrue(mapa.ListaDePaises().contains("Argentina"));
		Assert.assertTrue(mapa.ListaDePaises().contains("Uruguay"));
	}


	@Test(expected = RuntimeException.class) // VEr  ANDA MAL
	public void CrearMapaMundiNuevoYPreguntarSiEsQueSePuedeViajarAUnPaisQueTieneConexion() {
		
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
		
		mapa.ViajarA(argentina, "polonia");
		
	}
}
