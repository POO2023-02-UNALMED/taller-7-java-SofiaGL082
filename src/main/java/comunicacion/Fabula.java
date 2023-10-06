package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public void setEnssenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	public String getEnsenanza() {
		return this.ensenanza;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public int palabrasTotales(int num) {
		int resultado = super.getPaginas() * num * 1;
		return resultado;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String mensaje = super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas();
		mensaje += this.ensenanza;
		return mensaje;
	}

}
