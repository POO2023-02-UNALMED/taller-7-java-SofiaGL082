package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public String getCo_autor() {
		return this.co_autor;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEditorial() {
		return this.editorial;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getEdicion() {
		return this.edicion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int num) {
		int resultado = super.getPaginas() * num * 2;
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
		mensaje += this.co_autor + "\n";
		mensaje += this.editorial + "\n";
		mensaje += this.edicion;
		return mensaje;
	}

}
