package practica2TPA;

import java.util.Scanner;

import java.util.Locale;
import java.util.ResourceBundle;
import java.time.LocalDate;

import java.lang.Object;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileReader;

public class Main {
	 @SuppressWarnings({ "unused", "resource" })
	
	 public static void main(String[] args) {
		 Scanner entradaTeclado = new Scanner(System.in);
		 
		 
		 System.out.println("Elige idioma y pais (fr FR o en US) ");
		 String idioma = entradaTeclado.nextLine();
		 String pais =entradaTeclado.nextLine();
		 Locale locale = new Locale(idioma,pais);
		 ResourceBundle bundle = ResourceBundle.getBundle("resources/strings", locale);
		 
		 Habitaciones habitacion1,habitacion2,habitacion3,habitacion4,habitacion5,habitacion6,habitacion7,habitacion8,habitacion9,habitacion10 ;		 
		 habitacion1 = new Habitaciones(100,1,1,"una cama", "incluye television y frigorifico", 15.00, true, "individual");
		 habitacion2 = new Habitaciones(200,2,1,"cama familiar", "patio incluido", 20.00, true, "dos personas");
		 habitacion3 = new Habitaciones(300,3,1,"cama familiar y cama individual", "incluye television, frigorifico y caja fuerte", 25.00, true, "familiar");
		 habitacion4 = new Habitaciones(400,4,1,"una cama", "ningun extra", 12.00, false, "individual");
		 habitacion5 = new Habitaciones(500,5,2,"una cama", "incluye television, frigorifico y terraza baja", 17.00, true, "individual");
		 habitacion6 = new Habitaciones(600,6,2,"cama familiar y cama individual", "incluye television, frigorifico y caja fuerte", 25.00, false, "familiar");
		 habitacion7 = new Habitaciones(700,7,2,"una cama", "incluye television y frigorifico", 15.00, true, "individual");
		 habitacion8 = new Habitaciones(800,8,2,"una cama", "ningun extra", 12.00, true, "individual");
		 habitacion9 = new Habitaciones(900,1,1,"una cama", "incluye television y frigorifico en atico", 15.00, true, "individual");		 habitacion6 = new Habitaciones(600,6,2,"cama familiar y cama individual", "incluye television, frigorifico y caja fuerte", 25.00, false, "familiar");
		 habitacion10 = new Habitaciones(600,6,2,"dos camas familiares", "incluye television, frigorifico y caja fuerte", 28.00, true, "familiar");
		 
		 habitacion1.imprimeHabitaciones(habitacion1);
		 habitacion2.imprimeHabitaciones(habitacion2);
		 habitacion3.imprimeHabitaciones(habitacion3);
		 habitacion4.imprimeHabitaciones(habitacion4);
		 habitacion5.imprimeHabitaciones(habitacion5);
		 habitacion6.imprimeHabitaciones(habitacion6);
		 habitacion7.imprimeHabitaciones(habitacion7);
		 habitacion8.imprimeHabitaciones(habitacion8);
		 habitacion9.imprimeHabitaciones(habitacion9);
		 habitacion10.imprimeHabitaciones(habitacion10);
		 
		 
		 System.out.println(bundle.getString("Nombre"));		 
		 String nombre = entradaTeclado.nextLine();	
		 System.out.println("DNI");
		 String dni = entradaTeclado.nextLine();
		 System.out.println(bundle.getString("Direccion"));
		 String direccion = entradaTeclado.nextLine();		 				 
		 System.out.println(bundle.getString("Telefono"));
		 String telefono = entradaTeclado.nextLine();
		 System.out.println("Email");
		 String email = entradaTeclado.nextLine();
		 System.out.println(bundle.getString("Contrasena"));
		 String contrasena = entradaTeclado.nextLine();
		 
		 System.out.println("ACCEDER COMO TRABAJADOR O CLIENTE (1 TRABAJADOR 0 CLIENTE)");
		 int var = entradaTeclado.nextInt(); 
		 String opcion;
		 if(var==1) {
			 System.out.println("ACCEDIENDO A TRABAJADOR");
	 		 Trabajador Trabajador1 = new Trabajador(nombre,dni,direccion,telefono,email,contrasena);
	 		 LocalDate date = LocalDate.now();
	 		 System.out.println("DIA DE HOY"+ date);
	 		 System.out.println("TU SUELDO ACTUAL ES "+ Trabajador1.getSueldo());
		 }else {
			 System.out.println("ACCEDIENDO A CLIENTE");
		 	 new Cliente(nombre,dni,direccion,telefono,email,contrasena);	
		 	 System.out.println("USTED ESCOGIO LA HABITACION 5");
		 	 habitacion5.imprimeHabitaciones(habitacion5);
		 	 LocalDate date = LocalDate.parse("2021-05-03");		 	 
		 	 System.out.println("Su dia de llegada al hotel es: " + date);
		 	 int dias = entradaTeclado.nextInt();
		 	 LocalDate newDate = date.plusDays(dias);
		 	 System.out.println("Su dia de salida es: "+ newDate);
		 	 double precioTotal = habitacion5.getPrecioDiario() * dias;
		 	 
		 	 
		 }
		 
		 
			 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

				 
	 }
}
