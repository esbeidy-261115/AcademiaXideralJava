//importacion de las clases necesarias del uso de archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesPrincipal {

	public static void main(String[] args) {
		//Se crea el objeto File que tiene como nombre "datos.txt"
		File archivo = new File("datos.txt");

		//se inicia el try-with-resources
		//Abre un scanner para leer el archivo esto se cerrara cuando termina el bloque try sin necesidar de realizarlo manualmente llamando el .close()
        try (Scanner scanner = new Scanner(archivo)) {
        	//mientras haya una linea siguiente para leer retorna un true y imprime la linea
            while (scanner.hasNextLine()) {
                System.out.println("Línea: " + scanner.nextLine());
            }
            //captura la excepcion si no puede abrirse el archivo o no existe
        } catch (FileNotFoundException e) {
        	//imprime un mensaje con la excepcion
            System.out.println("Archivo no encontrado, excepcion: " + e);
        }

	}

}
