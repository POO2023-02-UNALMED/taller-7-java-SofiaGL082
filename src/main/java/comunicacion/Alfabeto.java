package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Alfabeto extends Pictograma{
	private static List<String> letras = new ArrayList<String>();
	private String interpretacion;
	
	public Alfabeto(String origen, List<String> letras, String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	public void setLetras(List<String> letras) {
		Alfabeto.letras = letras;
	}
	public List<String> getLetras() {
		return Alfabeto.letras;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public int cantidadLetras() {
		return Alfabeto.letras.size();
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String mensaje = "";
		for (int i=0; i<Alfabeto.letras.size();i++) {
			if (i< Alfabeto.letras.size()-1) {
				mensaje += Alfabeto.letras.get(i) + ", ";
			}
			else {
				mensaje += Alfabeto.letras.get(i);
			}
		}
		return mensaje;
	}
	
	

}
