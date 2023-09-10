package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class manejo {
    public static void main(String[] args) {
        String entrada, nombre, placa,  ID;
        entrada=JOptionPane.showInputDialog(null, " si desea iniciar la carga de los datos ponga (Y) para si o (N) para no cargarlos ");
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog(null, " cual es la cantidad de paquetes que desea ingresar"));
        if(entrada.equals("Y")){
        nombre=JOptionPane.showInputDialog(null," ingrese el nombre de quien envia el paquete");
        placa= JOptionPane.showInputDialog(null, " ingrese la placa del auto/camion que trae el paquete ");
        ID= JOptionPane.showInputDialog(null," ingrese el Id de a quien se debe entregar el paquete  ");
        registro prueba= new registro(nombre, cantidad, placa,ID);
        registro prueba2= new registro("juan");
        System.out.println(prueba.toString());
        System.out.println(prueba2.toString());

        }
        
    }
}
