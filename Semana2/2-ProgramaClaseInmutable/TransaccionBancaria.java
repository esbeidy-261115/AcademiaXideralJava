import java.time.LocalDateTime;

//Se crea una clase inmutable y se identifica por la palabra final que tiene de nombre TransaccionBancaria
public final class TransaccionBancaria {
	
	//Se declaran las propiedades inmutables
	//Id de la transaccion realizada
	private final String idTransaccion;
	//Monto de la transaccion que esta realizando
    private final double monto;
    //Tipo de transaccion esta haciendo "DEPOSITO" o "RETIRO"
    private final String tipo;
    //Fecha y hora que esta realizando la transaccion
    private final LocalDateTime fechaHora;
    
    //Constructor de la clase pasandole todas las propiedades declaradas arriba
    public TransaccionBancaria(String idTransaccion, double monto, String tipo, LocalDateTime fechaHora) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
    }
    
    //Se crean los getters pero no los setter para evitar que se puedan modificar    
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
   
  //Se declara el main
  public static void main(String[] args) {
  	//Se instancia la clase inmutable y se le pasa esos datos que mas adelante no se pueden modificar solo obtener el valor
      TransaccionBancaria transaccion = new TransaccionBancaria(
          "TRANSACCION-001", 
          1000.00, 
          "DEPOSITO", 
          LocalDateTime.now()
      );

      //Aqui se obtiene y se imprime la informacion de los datos inmutables
      System.out.println("****Comienza transaccion****");
      System.out.println("ID: " + transaccion.getIdTransaccion());
      System.out.println("Monto: " + transaccion.getMonto());
      System.out.println("Tipo: " + transaccion.getTipo());
      System.out.println("Fecha: " + transaccion.getFechaHora());
      System.out.println("****Finaliza transaccion****");
      
      
  }
}

