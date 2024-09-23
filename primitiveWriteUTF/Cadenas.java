
package primitivewriteutf;

import java.io.*;

/**
 * clase con los métodos que escriben cadenas de texto
 * @author cristian
 * @version 1.0
 */
public class Cadenas {

	/**
	 * metodo para leer lo escrito en un archivo de texto
	 * @param sentence la frase que le pasamos por parametro
	 * @param pathFile el path donde ha de leer el archivo
	 */
	public void readSentence(File pathFile) {


		try {

			//objetos data para meter el path y leer el archivo
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(pathFile)));

			//mientras el tamaño sea mayor que 0, lee el archivo
			while(dis.available() > 0) {
				int lengthBytes = dis.available();
				String leyendoCadena = dis.readUTF();
				System.out.println("Bytes por leer: " + lengthBytes);
				System.out.println("Cadena: " + leyendoCadena);
			}


		}catch(IOException e) {
			System.out.println("No se encontró el archivo para leer");
			e.printStackTrace();
		}

	}

	/**
	 * metodo para escribir  en un archivo de texto
	 * @param sentence la frase que le pasamos por parametro
	 * @param pathFile el path donde ha de escribir el archivo
	 */
	public void writeSentence(String sentence, File pathFile) {

		try {
			//objetos data para meter el path y escribir el archivo
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(pathFile)));

			//usamos un for para escribir 3 veces
			for(int i = 0; i<3; i++) {
				dos.writeUTF(sentence);
				System.out.println("escribiendo: " + sentence);
				System.out.println("Tamaño del archivo: " + dos.size());
			}
			dos.close();

		}catch(IOException e) {

			System.out.println("no se pudo escribir en el archivo");
			e.printStackTrace();
		}
	}

}
