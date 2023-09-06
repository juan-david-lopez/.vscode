package co.uq.uniquindio.poo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class arrayLisOBjetos {
    private ArrayList <Usuario> ListaUsuarios = new ArrayList<Usuario>();
    Usuario usuarios;
public void addicionar(){
    int num=Integer.parseInt(JOptionPane.showInputDialog(null, "coloque la cantidad de usuarios"));
    for (int index = 0; index <num ; index++) {
        String nombre = JOptionPane.showInputDialog(null, "coloque el nombre");
    String ID = JOptionPane.showInputDialog(null, "coloque el id usuario");
    String TipoCuenta = JOptionPane.showInputDialog(null, "coloque el tipo cuenta");
    usuarios = new Usuario("lista");
    usuarios.setID(ID);
    usuarios.setNombre(nombre);
    usuarios.setTipoCuenta(TipoCuenta);
    ListaUsuarios.add(usuarios);   
    }
}

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
