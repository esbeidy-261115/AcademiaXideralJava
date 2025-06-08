//Clase de Notificaciones por sms en donde se implemente la interfaz del servicio del mensaje 
public class NotificacionSMS implements ServicioMensaje {
	//Se implementa el metodo de la interfaz y se utiliza el Override para sobreescribir el metodo, esto solo imprime un mensaje indicando que es por SMS
	@Override
	public void enviaMensaje(String mensaje) {
		System.out.println("Se esta enviando la notificacion por SMS: " + mensaje);
	}
}
