package ar.edu.undav.general;
import java.util.List;

public class Villano {
		private String nombre;
		private char sexo;
		private List<String> seniasParticulares;
		private List<String> hobbies;
		
		public Villano (String nombre, char sexo, List<String> seniasParticulares, List<String> hobbies) {
			this.nombre=nombre;
			this.sexo=sexo;
			this.seniasParticulares.addAll(seniasParticulares);
			this.hobbies.addAll(hobbies);
		}
		
		public List<String> ObtenerHobbies(){
			return this.hobbies;
		}
		
		public List<String> ObtenerSeniasParticulares(){
			return this.seniasParticulares;
		}
		
		public String ObtenerNombre() {
			return this.nombre;
		}
		
		public char ObtenerSexo() {
			return this.sexo;
		}

}
