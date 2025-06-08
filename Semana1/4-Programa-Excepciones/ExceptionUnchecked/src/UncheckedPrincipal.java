
public class UncheckedPrincipal {

	public static void main(String[] args) {
		//Se declara un arreglo de numeros
		int[] numeros = {1,2,3};
		
		//Se intenta imprimir el numero de la posicion 5
		//Lanza la excepcion ArrayIndexOutOfBoundsException porque intenta acceder a una posicion fuera del rango valido
		System.out.print(numeros[5]);

	}

}
