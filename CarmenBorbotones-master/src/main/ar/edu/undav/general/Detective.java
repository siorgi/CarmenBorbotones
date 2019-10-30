package ar.edu.undav.general;

import java.util.List;

public class Detective {
	
	private Pais paisActual;
	private Caso caso;
	private MapaMundi mapa;
	
	public Detective(MapaMundi mapa) {
		this.mapa=mapa;
	}
	
	public void CasoNuevo(Caso caso) {
		this.caso=caso;
		this.paisActual=caso.PaisDelCrimen();
	}
	
	public Pais ObtenerPaisActual() {
		return this.paisActual;
	}
	
	public List<String> ObtenerConexionesPaisActual(){
		return this.paisActual.getConexiones();
		//return (List<String>) conexiones.stream().map(pais-> pais.getNombre());
	}
	
	public void ViajarA(String paisDestino) {
		this.paisActual= mapa.SePuedeViajarA(this.paisActual, paisDestino) ? this.mapa.ObtenerPais(paisDestino) : paisActual;
	}
	
	public boolean PedirOrdenDeArrestoA(Villano villano) {
		return this.caso.ArrestarA(villano) ? true : false;
	}

}
