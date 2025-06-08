
public class CheckedPrincipal {

	public static void main(String[] args) {
	
		try {
			
			System.out.println("Esperando 2 segundos...");
			//Hilo de 2 segundos 
			Thread.sleep(2000);
			System.out.println("Terminado exitosamente");
			
		}catch (InterruptedException e)
		{
			//Esta excepcion puede presentarse cuando otro hilo interrumpe al hilo principal y no termina los 2 segundos el bloque catch lo detecta y lanza la excepcion
			System.out.println("El hilo fue interrumpido");
		}
		
	}

}
