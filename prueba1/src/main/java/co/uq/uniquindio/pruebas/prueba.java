package co.uq.uniquindio.pruebas;

import javax.swing.JOptionPane;


public class prueba {
    public static void main(String[] args) {
    int num= Integer.parseInt(JOptionPane.showInputDialog(null, "cuantos autos ingresan"));
    for(int i=0;i<num;i++){
    String tipoauto=JOptionPane.showInputDialog(null, "ingrese el tipo de auto").toUpperCase();
    String TipoLavado=(JOptionPane.showInputDialog(null, "ingrese el tipo de lavado").toUpperCase());
    String placa= JOptionPane.showInputDialog(null, "ingrese el tipo de PLACA");
    String nombre = JOptionPane.showInputDialog(null, "ingrese el tipo de NOMBRE");
    String numeroContacto=JOptionPane.showInputDialog(null, "ingrese el tipo de NUMERO CONTACTO ");
    String emailcliente= JOptionPane.showInputDialog(null, "ingrese el tipo de EMAIL CLIENTE");

    Auto moto = new Auto();
    moto.setNombre(nombre);
    moto.setPlaca(placa);
    moto.setEmailcliente(emailcliente);
    moto.setNumeroContacto(numeroContacto);
    if(verificadorlavado(TipoLavado)){
        moto.setTipolavado(TipoLavado);
        System.out.println(moto.getTipolavado());
    }
    if(verificarAuto(tipoauto)){
        moto.setTipoVehiculo(tipoauto);
    }
    moto.setPreciolavado();
    System.out.println(moto.toString());
    }
    
    
}
    
public static boolean verificadorlavado( String TipoLavado){
    boolean verificar=false;
    String valortemp="";
    for(tipoLavado g: tipoLavado.values()){
        valortemp=g+"";
        if(valortemp.equals(TipoLavado)){
            verificar= true;
        }
    }
    return verificar;
}
public static boolean verificarAuto(String tipoauto ){
    boolean centinela= false;
    String valortemp="";
    for(TipoAuto v: TipoAuto.values()){
            valortemp=""+v;
            if(valortemp.equals(tipoauto)){
                centinela=true;
            }
        }
        return centinela;
    }
}

