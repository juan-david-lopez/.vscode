package co.uniquindio.poo.persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import co.unquindio.poo.logica.Torneo;

public class Persistencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5483445117312313181L;
	private ArrayList<Torneo> torneos= new ArrayList<Torneo>();
	
	public void serialize(String nombreArchivo) throws Exception {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		fos = new FileOutputStream(nombreArchivo);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(this);
		
		oos.close();
		fos.close();
	}
	public final String ruta() {
		String RUTA="src/main/java/informacion.data";
		return RUTA;
	}
	public void guardaR(String nombreArchivo) {
		try {
			serialize(nombreArchivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void readInfo(String nombreArchivo) {
		try {
			deserialize(nombreArchivo);
		} catch (Exception e) {
			
			try {
				serialize(nombreArchivo);
			} catch (Exception e1) {
				
			}
		}
	}
	private void deserialize(String nombreArchivo) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(nombreArchivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Persistencia data = (Persistencia) ois.readObject();
		
		ois.close();
		fis.close();
	}
	public static void escribirArchivo(String nombre, ArrayList<String> miTexto, boolean adicionar) throws IOException {
		File miArchivo = new File(nombre);
		FileWriter miFileWriter = new FileWriter(miArchivo, adicionar);
		BufferedWriter miBufferWriter = new BufferedWriter(miFileWriter);
		for (String linea : miTexto) {
			miBufferWriter.write(linea + "\n");
		}
		miBufferWriter.close();
		miFileWriter.close();
	}
}
