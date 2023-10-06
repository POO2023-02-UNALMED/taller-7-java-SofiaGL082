package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private static String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] arg, String conclusion, String refer,String inter) {
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
	
	public void setArgumentos(String[] arg) {
		Tesis.argumentos = arg;
	}
	public String[] getArgumentos() {
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
		String mensaje = super.getOrigen() + "\n"; 
		mensaje += super.getTitulo() + "\n";
		mensaje += super.getAutor() + "\n"; 
		mensaje += super.getPaginas() + "\n";
		mensaje += this.idea + "\n";
		mensaje += Tesis.argumentos.length + "\n";
		mensaje += this.conclusion + "\n";
		mensaje += this.referencias;
		return mensaje;
	}

}
