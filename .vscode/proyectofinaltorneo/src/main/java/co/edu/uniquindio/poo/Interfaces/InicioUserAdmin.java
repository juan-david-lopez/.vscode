package co.edu.uniquindio.poo.Interfaces;

public interface InicioUserAdmin {
	public void verificarAdmin(String credenciales, String user, String contraseña);
	public default void mensajeError() {
		System.out.println(" no se pudo verificar el usuario recibido de administrador ");
	}
}
