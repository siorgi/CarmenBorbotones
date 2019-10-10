package TestUnitarios;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import General.Pais;

class PaisTest {

	@Test
	void testPais() {
		List<String> caracteristicas=new ArrayList<String>();
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		Pais argentina = new Pais("Argentina", caracteristicas);
		
	}

	@Test
	void testGetNombre() {
		List<String> caracteristicas=new ArrayList<String>();
		caracteristicas.add("Toman mate");
		caracteristicas.add("Hacen asado");
		caracteristicas.add("Comen dulce de leche");
		Pais argentina = new Pais("Argentina", caracteristicas);
		Assert.assertEquals("Argentina", argentina.getNombre());
	}

	@Test
	void testGetLugarInteres() {
		
	}

	@Test
	void testGetConexiones() {
		fail("Not yet implemented");
	}

}
