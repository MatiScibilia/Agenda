package Principal;

public class Eventos extends Agenda{

    String lugar;
    String fechaeventos;
    
        public Eventos(String Nombre, String Descripcion, String lugar,String fechaeventos){
           super(Nombre, Descripcion);
            this.lugar=lugar;
            this.fechaeventos=fechaeventos;
    
        }
    
}
