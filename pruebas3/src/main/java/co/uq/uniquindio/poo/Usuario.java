package co.uq.uniquindio.poo;

public class Usuario {
    public Usuario(String contraseña){
        if(contraseña!=null){
            this.contraseña=contraseña;
        }
    }
    private String nombre;
    private String tipoCuenta;
    private String ID;
    protected String contraseña;

    public String getContraseña() {
        return contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    public String toString(){
        return "el ID del usuario es: "+getID()+" el nombre del usuario es: "+getNombre()+" el tipo de cuenta es: "+getTipoCuenta();
    }
    public boolean AutenticarUsuario(String iD, String contraseña){
        boolean autentica= false;
        if(iD.equals(getID()) && contraseña.equals(getContraseña())){
            autentica=true;
        }
        return autentica;
    }
}
