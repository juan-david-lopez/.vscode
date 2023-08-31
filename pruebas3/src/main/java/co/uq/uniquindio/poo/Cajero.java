package co.uq.uniquindio.poo;

public class Cajero{
    //protected Usuario usuario;
    private double CapacidadCuenta;
    private double saldo;
    private int Numtransacciones;
    private Usuario usuario;
    public Cajero(Usuario usuario){
        if(usuario!=null){
            setUsuario(usuario);
        }
    }
    /**
     * metodos del cajero
     * @param saldo
     * @return mensaje para saber si se realizo el set o no
     */
    public String settSaldo(double saldo){
        String message="";
        if(saldo>0.0){
            message="Se pudo hacer el cambio en el saldo";
            this.saldo= saldo;
        }
        else{
            message = "no se pudo hacer el cambio en el saldo";
        }
        return message;
    }
    public double getSaldo(){
        return saldo;
    }
    public int getNumtransacciones(){
        return Numtransacciones;
    }
    public double getCapacidadCuenta() {
        return CapacidadCuenta;
    }
    public void setCapacidadCuenta(double capacidadCuenta) {
        this.CapacidadCuenta = capacidadCuenta;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    /**
     * @author Juan David Lopez H
     * funciones del cajero
     */
    public boolean retiroDinero(double retiroDinero){
        boolean sepuedeRetirar=false;
        if(retiroDinero<saldo){
            sepuedeRetirar=true;
            settSaldo(getSaldo()-retiroDinero);
        }
        return sepuedeRetirar;
    }
    public boolean ingresoDinero(double valorIngre){
        boolean verificar=false;
        if(valorIngre>0.0){
            verificar=true;
            settSaldo(getSaldo()+valorIngre);
        }
        return verificar;
    }
    public boolean transaccion(double valorT, Cajero usuario){
        boolean verificaTransac=false;
        if(valorT<saldo){
            settSaldo(valorT-getSaldo());
            usuario.ingresoDinero(valorT);
        }
        return verificaTransac;
    }

}
