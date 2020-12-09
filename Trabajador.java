package practica2TPA;

public class Trabajador extends Usuario{
	public int sueldo;

	public Trabajador(String nombre, String dni, String direccion, String telefono, String email,
			String contrasena) {
		super();
		sueldo = 1200;
	}
	
	
	
	public void setEmail(String email) {
		String emailEmpleado="@condes";
		if(email.indexOf(emailEmpleado)==1) {
			setEmail(email);
		}else {
			System.out.println("Email erroneo");
		}
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
}
