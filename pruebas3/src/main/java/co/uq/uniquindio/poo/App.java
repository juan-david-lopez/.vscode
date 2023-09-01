package co.uq.uniquindio.poo;
import co.uq.uniquindio.poo.;
/**
 * pruebas y quema de datos
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Usuario user1= new Usuario("123546");
        Cajero cajero= new Cajero(user1);
        System.out.println(cajero.getSaldo());
        System.out.println(cajero.getUsuario().toString());
        arrayLisOBjetos objeto1= new arrayLisOBjetos();
    }
}
