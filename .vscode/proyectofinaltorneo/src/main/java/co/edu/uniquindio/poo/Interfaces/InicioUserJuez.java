package co.edu.uniquindio.poo.Interfaces;

public interface InicioUserJuez {
	public  boolean verificarContraseña(String usuario, String contraseña);
	public default  void devolverMensaje() {
		System.out.println("no se pudo verifiacar el usuario del juez");
		
	}
}
	
