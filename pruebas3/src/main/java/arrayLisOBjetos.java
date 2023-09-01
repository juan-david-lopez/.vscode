import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.uq.uniquindio.poo.Usuario;

public class arrayLisOBjetos {
    public arrayLisOBjetos(){
        String nombre = JOptionPane.showInputDialog(null, "coloque el nombre");
        String ID = JOptionPane.showInputDialog(null, "coloque el id usuario");
        String TipoCuenta = JOptionPane.showInputDialog(null, "coloque el tipo cuenta");
        Usuario usuarios;
        usuarios = new Usuario("lista");
        usuarios.setID(ID);
        usuarios.setNombre(nombre);
        usuarios.setTipoCuenta(TipoCuenta);
        ListaUsuarios.add(usuarios);
    }
    private ArrayList <Usuario> ListaUsuarios = new ArrayList<Usuario>();
    
public void agregar(Usuario user){
    ListaUsuarios.add(user);
}
public void eliminar(Usuario user){
    ListaUsuarios.remove(user);
}
public void iterar(int puesto){
    ListaUsuarios.get(puesto);
}
public int contarPuestos(){
    return ListaUsuarios.size();
}
}