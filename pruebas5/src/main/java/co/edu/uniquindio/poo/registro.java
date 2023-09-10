package co.edu.uniquindio.poo;

public record registro( String nombre, int cantidad, String placa, String ID) {
    public registro(String nombre){
        this(nombre, 0, "1301","32");
    }
    @Override
    public String toString(){
     String data="";
     data+= " el nombre del que envia es: "+nombre()+ " la cantidad de paquetes es: "+ cantidad()+" la placa del camion/auto es: "+placa()+" el ID del receptor es: "+ID();
     return data;   
    }
}
