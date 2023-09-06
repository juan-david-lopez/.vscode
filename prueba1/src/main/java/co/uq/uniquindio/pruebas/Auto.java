package co.uq.uniquindio.pruebas;

public class Auto {
    public Auto(){

    }
    private String placa;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    private String numeroContacto;
    private String emailcliente;

    public String getEmailcliente() {
        return emailcliente;
    }
    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }
    private int Preciolavado;
    public int getPreciolavado() {
        return Preciolavado;
    }
    
    public void setPreciolavado() {
        int precio=0;
        if(getTipoVehiculo().equals("AUTOMOVIL")  && getTipolavado().equals("SIMPLE")){
            precio=30000;
        }
        if(getTipoVehiculo().equals("AUTOMOVIL") && getTipolavado().equals("POLICHADO")){
            precio=45000;
        }
        if(getTipoVehiculo().equals("AUTOMOVIL") && getTipolavado().equals("DELUX")){
            precio=60000;
        }
        if(getTipoVehiculo().equals("CAMIONETA")  && getTipolavado().equals("SIMPLE")){
            precio=40000;
        }
        if(getTipoVehiculo().equals("CAMIONETA") && getTipolavado().equals("POLICHADO")){
            precio=60000;
        }
        if(getTipoVehiculo().equals("CAMIONETA")  && getTipolavado().equals("DELUX")){
            precio=80000;
        }
        if(getTipoVehiculo().equals("MOTO") && getTipolavado().equals("SIMPLE")){
            precio=10000;
        }
        if(getTipoVehiculo().equals("MOTO") && getTipolavado().equals("POLICHADO")){
            precio=15000;
        }
        if(getTipoVehiculo().equals("MOTO") && getTipolavado().equals("DELUX")){
            precio=20000;
        }
        this.Preciolavado = precio;
    }
    private String tipoVehiculo;

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    private String tipolavado;
    public String getTipolavado() {
        return tipolavado;
    }
    public void setTipolavado(String tipolavado) {
        this.tipolavado = tipolavado;
    }
    @Override
    public String toString(){

        return " el email del cliente es: "+getEmailcliente()+" el nombre del cliente es: "+getNombre()+" el numero de contacto: "+getNumeroContacto()+" la placa del cliente es: "+getPlaca()+" el precio del lavado es: "+getPreciolavado()+" el tipo de vehiculo es: "+getTipoVehiculo()+" el tipo de lavado es: "+getTipolavado();
    }

}
