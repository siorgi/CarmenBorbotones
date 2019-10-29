package ar.edu.undav.general;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MapaMundi {
	
	private HashMap<String, Pais> paises;
	
	//Constructor
	public MapaMundi() {
		
		paises = new HashMap<String, Pais>();
	}

	public void ViajarA(Pais paisActual, String paisDestino) {
		List<String> conexionesPaisActual = paisActual.getConexiones();
		if(!conexionesPaisActual.contains(paisDestino)) {
			throw new RuntimeException("No hay conexion entre paises");
		}
	}

	public Pais ObtenerPais(String paisDestino) {
		Pais paisADondeVa = paises.get(paisDestino);
		if(paisADondeVa!=null) {
			return paisADondeVa;
		}
		else {
			throw new RuntimeException("El pais al que quiere viajar no existe");
		}
	}
	
	public void AgregarPais(Pais pais) {
		paises.put(pais.getNombre(), pais);
	}

	public List<String> ListaDePaises() {
		Set setPaises= this.paises.keySet();
		List<String> listaPaises = new ArrayList<String>(setPaises);
		return listaPaises;
	}
	
	
	

}
