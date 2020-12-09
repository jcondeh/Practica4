package practica2TPA;


public class Reserva {
	int idReserva;
	int idHabitacion;
	String fechaIngresa;
	String fechaSalida;
	double costeTotal;
	Cliente cliente1;
	
	public Cliente getCliente1() {
		return cliente1;
	}

	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}

	public Reserva(int idHabitacion, String fechaIngresa, String fechaSalida, double costeTotal) {
		super();
		
		this.idHabitacion = idHabitacion;
		this.fechaIngresa = fechaIngresa;
		this.fechaSalida = fechaSalida;
		this.costeTotal = costeTotal;
	}
	
	public Reserva() {
		
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public String getFechaIngresa() {
		return fechaIngresa;
	}

	public void setFechaIngresa(String fechaIngresa) {
		this.fechaIngresa = fechaIngresa;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getCosteTotal() {
		return costeTotal;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	
	
	
}
