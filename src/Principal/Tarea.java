package Principal;

public class Tarea extends Agenda {
    //constructor
    //parametrosformales
    String fechatarea;

    public Tarea (String Nombre,String Descripcion,String fechatarea){
       super(Nombre, Descripcion);
       this.fechatarea=fechatarea;
    }
}
