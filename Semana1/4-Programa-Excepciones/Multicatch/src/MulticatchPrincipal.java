
public class MulticatchPrincipal {
	public static void main(String[] args) {
		try {
			//se declara una variable entero y se intenta pasar a int abc cosa que esta mal y eso genera una excepcion NumberFormatException
			int numero = Integer.parseInt("abc");
			
			//se declara una variable entero y realiza una division entre 0, eso hace que genere una excepcion ArithmeticException ya que no se puede 
			int division = 10/0;
		}catch (NumberFormatException | ArithmeticException e) // Se captura los 2 tipos de excepciones que estan en este codigo
		{
			//Simplemente imprime el mensaje "Ocurrio un error: " y el nombre la clase de la excepcion a la cual se capturo
			System.out.println("Ocurrio un error: " + e.getClass().getSimpleName());
		}
	}
}
