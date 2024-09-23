
package primitivewriteutf;

import java.io.File;

/**
 * clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {

		//hacemos objeto de la clase con los metodos y los llamamos
		Cadenas metodosCadenas = new Cadenas();
		File myFile;
		metodosCadenas.writeSentence("o tempo está xélido", myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/primitive/texto3.txt"));
		metodosCadenas.readSentence(myFile = new File("/home/dam/Desktop/DAM2/Acceso a Datos/primitive/texto3.txt"));
	}
}