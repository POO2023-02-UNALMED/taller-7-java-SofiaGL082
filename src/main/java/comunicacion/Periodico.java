package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFecha() {
		return this.fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	public String getPrimicia() {
		return this.primicia;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int num) {
		int resultado = super.getPaginas() * num * 10;
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
		mensaje += this.fecha + "\n";
		mensaje += this.primicia;
		return mensaje;
	}

}
