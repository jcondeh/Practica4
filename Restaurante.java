package practica2TPA;

public class Restaurante implements Comercio{
	private String nombreRestaurante;
	private String ciudad;
	private int precioMenuDia;
	
	
	public int getPrecioMenuDia() {
		return precioMenuDia;
	}

	public void setPrecioMenuDia(int precioMenuDia) {
		this.precioMenuDia = precioMenuDia;
	}

	public Restaurante(String nombreRestaurante, String ciudad) {
		super();
		this.nombreRestaurante = nombreRestaurante;
		this.ciudad = ciudad;
	}

	public void setNombre(String nombre) {
		nombre=nombreRestaurante;
		
	}


	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
		
	}


	public String getNombre() {
		
		return nombreRestaurante;
	}


	public String getCiudad() {
		
		return ciudad;
	}

	

}
