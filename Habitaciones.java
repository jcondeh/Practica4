package practica2TPA;

public class Habitaciones {
	private int id;
	private int numero;
	private int piso;
	private String descripcion;
	private String caracteristicas;
	private double precioDiario;
	private boolean disponible;
	private String tipoHabitacion;
	
	public Habitaciones(int id, int numero, int piso, String descripcion, String caracteristicas, double precioDiario,
			boolean disponible, String tipoHabitacion) {
		super();
		this.id = id;
		this.numero = numero;
		this.piso = piso;
		this.descripcion = descripcion;
		this.caracteristicas = caracteristicas;
		this.precioDiario = precioDiario;
		this.disponible = disponible;
		this.tipoHabitacion = tipoHabitacion;
	}
	
	public Habitaciones() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public double getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(double precioDiario) {
		this.precioDiario = precioDiario;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	public void imprimeHabitaciones(Habitaciones habitacion) {
		if(habitacion.isDisponible()) {
			System.out.println("LISTA DE HABITACIONES DISPONIBLES");
		System.out.println("Numero de Habitacion: " + habitacion.getNumero());
		System.out.println("Numero de Piso " + habitacion.getPiso());
		System.out.println("Descripcion: " + habitacion.getDescripcion());
		System.out.println("Caracteristicas: " + habitacion.getCaracteristicas());
		System.out.println("Precio por noche: " +habitacion.getPrecioDiario());
		System.out.println("Tipo de habitacion: " + habitacion.getTipoHabitacion());
		System.out.println();
		}else {
			System.out.println("Habiatacion no disponible");
			System.out.println();
		}



	}
	
	

}
