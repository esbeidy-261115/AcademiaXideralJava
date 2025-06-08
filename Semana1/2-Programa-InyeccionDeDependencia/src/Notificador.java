//Clase de Notificador donde se inyecta en el constructor el servicioMensaje
public class Notificador {
	private ServicioMensaje servicio;
	
	//Aqui se realiza la inyeccion de dependencia por el constructor
	public Notificador(ServicioMensaje servicio) {
		this.servicio = servicio;
	}
	
	//Es un metodo que llama al metodo enviarMensaje del ServicioMensaje pasandole el mensaje como parametro
	public void notificar(String mensaje) {
		servicio.enviaMensaje(mensaje);
	}
}
