
public class CrearLogger {

	//Se declara una variable estatica y privada
	private static CrearLogger instancia;

	//Constructor privado que solo imprimira un mensaje
    private CrearLogger() {
        System.out.println("Logger creado");
    }

    //Metodo publico y estatico, al ser static se puede llamar sin crear un objeto
    public static CrearLogger getInstance() {
    	//Se valida que si la instancia es null, se realiza otra vez la instancia y retorna la instancia
        if (instancia == null) {
            instancia = new CrearLogger();
        }
        return instancia;
    }

    //Metodo para que imprima el mensaje del log
    public void log(String mensaje) {
        System.out.println("[LOG]: " + mensaje);
    }
	 
	 public static void main(String[] args) {
		 
		 //aqui se llama la Instancia 2 veces para diferentes logs, suponiendo que uno inicia aplicacion y el otro carga las configuraciones
		 CrearLogger log1 = CrearLogger.getInstance();
		 CrearLogger log2 = CrearLogger.getInstance();

	        log1.log("Iniciando aplicación...");
	        log2.log("Cargando configuración...");

	        //Validacion que permite visualizar que es el mismo objeto al que esta haciendo referencia lo que retorna true
	        System.out.println("Es el mismo objeto: " + (log1 == log2)); 
	    }
	 
}
