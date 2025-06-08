
public class Principal {
	public static void main(String[] args) {
		//Este es la clase main en donde se realiza la inyeccion de dependencia 
		//realiza el envio de notificaciones por email
		ServicioMensaje emailServicio = new NotificacionEmail();
		Notificador notificadorMensajeEmail = new Notificador (emailServicio);
		notificadorMensajeEmail.notificar("Hola por correo");
		
		//realiza el envio de notificaciones por SMS
		ServicioMensaje smsServicio = new NotificacionSMS();
		Notificador notificadorMensajeSms = new Notificador(smsServicio);
		notificadorMensajeSms.notificar("Hola por SMS");
		
	}
}
