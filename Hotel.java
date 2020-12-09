package practica2TPA;

public class Hotel implements Comercio{
	private String nombreHotel;
	private String ciudad;
	
	public Hotel(String nombreHotel, String ciudad) {
		super();
		this.nombreHotel = nombreHotel;
		this.ciudad = ciudad;
	}
	
	public Hotel() {
		
	}

	public String getNombre() {
		return nombreHotel;
	}

	public void setNombre(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	
	

}
