package Principal;

public class Recordatorio extends Agenda{

    String hora;
    String fecha;

    public Recordatorio (String Nombre,String Descripcion,String hora, String fecha) {
        super(Nombre, Descripcion);
        this.fecha=fecha;
        this.hora=hora;
    }

}