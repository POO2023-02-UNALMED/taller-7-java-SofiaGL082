package comunicacion;

import java.util.ArrayList;
import java.util.List;

public class Tesis extends Escrito{
	private String idea;
	private static List<String> argumentos = new ArrayList<String>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, List<String> arg, String conclusion, String refer,String inter) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = arg;
		this.conclusion = conclusion;
		this.referencias = refer;
		this.interpretacion = inter;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String getIdea() {
		return this.idea;
	}
	
	public void setArgumentos(List<String> arg) {
		Tesis.argumentos = arg;
	}
	public List<String> getArgumentos() {
		return Tesis.argumentos;
	}
	
	public void setConclusion(String concl) {
		this.conclusion = concl;
	}
	public String getConclusion() {
		return this.conclusion;
	}
	
	public void setReferencias(String refer) {
		this.referencias = refer;
	}
	public String getReferencias() {
		return this.referencias;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public int palabrasTotales(int num) {
		int resultado = super.getPaginas() * num * 5;
		return resultado;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String mensaje = super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas();
		mensaje += this.idea + "\n";
		mensaje += Tesis.argumentos.size() + "\n";
		mensaje += this.conclusion + "\n";
		mensaje += this.referencias;
		return mensaje;
	}

}
