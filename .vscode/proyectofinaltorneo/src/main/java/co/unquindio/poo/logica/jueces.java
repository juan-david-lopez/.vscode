package co.unquindio.poo.logica;

public class jueces extends Persona{
    
	public jueces(String ID, String nombreCompleto) {
		super(ID, nombreCompleto);
		
	}
	private String user;
    private String contraseña;
    private int numVecesJuez;
    
    public int getNumVecesJuez() {
        return numVecesJuez;
    }
    public void setNumVecesJuez(int numVecesJuez) {
        this.numVecesJuez = numVecesJuez;
    }
    
    public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
