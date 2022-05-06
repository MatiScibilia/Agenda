/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Mati
 * 
 
 */
//probando


public class Main {
    public static void main(String[] args) {
        
       Scanner Entrada= new Scanner(System.in);
       LocalDateTime now = LocalDateTime.now();

       // ARREGLO PARA TAREAS
       Tarea[] ListaDeTareas= new Tarea[10];
       Tarea tareas= new Tarea("as", "De", "as");

        //ARREGLO PARA RECORDATORIOS
       Recordatorio[] listaDeRecordatorios = new Recordatorio[10];
       Recordatorio recordatorio = new Recordatorio ("Nasd", "Descripcion", "asd", "asd");

       //ARREGLO PARA EVENTOS
       Eventos[] listaDEventos = new Eventos[10];
       Eventos eventos= new Eventos("Nombre", "Descripcion", "asd", "asd"); 

       //atributos de las clases
       String Nombre;
       String Descripcion;
       String  Hora;
       String Fecha;
       String fechatarea;
       String lugar;
       String fechaeventos;

     


       int ent;
       //VARIABLE PARA MODIFICAR ALGO EN LA AGENDA
       int ModAgenda;
       //VARIABLE PARA MODIFICAR LA LISTA DE TAREAS
       String ModTarea;
       //VARIABLE PARA MODIFICAR LA LISTA DE RECORDATORIOS
       String ModRecordatorio;
       //VARIABLE PARA MODIFICAR LA LISTA DE EVENTOS
       String ModEventos;
       // CONTADOR DE TAREAS INGRESADAS
       int z=0;
       //CONTADOR DE RECORDATORIOS INGRESADOS
       int contrecord=0;
       // CONTADOR DE EVENTOS INGRESADOS
       int conteventos=0;
       //variable para elegir cargar una nueva tarea,recordatorio o evento
       int tipo;
       // VARIABLE PARA VER LAS LISTAS DE TAREAS O RECORDATORIOS O EVENTOS
       int verlistas;

       String aux="0";
       
      do{
      
      System.out.println("Ingrese 1 para cargar una nueva tarea,evento o recordatorio en la agenda");
      System.out.println("Ingrese 2 para modificar algo en la agenda");
      System.out.println("Ingrese 3 para mostrar la lista de tareas, eventos o recordatorios");
      System.out.println("Ingrese 0 para salir");

      ent=Entrada.nextInt();
      Entrada.nextLine();
      
      while(ent < 0 || 4 < ent){
        System.out.println("ERROR.");
                
        System.out.println("Ingrese 1 para cargar una nueva tarea,evento o recordatorio en la agenda");
        System.out.println("Ingrese 2 para mostrar la lista de tareas, eventos o recordatorios");
        System.out.println("Ingrese 3 para modificar algo en la agenda");
        System.out.println("Ingrese 0 para salir");
        ent=Entrada.nextInt();
          
      }
      
      switch(ent){

            case 1:

                System.out.println("Ingrese 5 para crear una nueva tarea");
                System.out.println("Ingrese 6 para crear un nuevo recordatorio");
                System.out.println("Ingrese 7 para crear un nuevo evento");
                tipo= Entrada.nextInt();

                while(tipo < 5 || 7 < tipo){
                    System.out.println("ERROR");
                    System.out.println("Ingrese 5 para crear una nueva tarea");
                    System.out.println("Ingrese 6 para crear un nuevo recordatorio");
                    System.out.println("Ingrese 7 para crear un nuevo evento");
                    tipo= Entrada.nextInt();

                }

                    switch(tipo){
                        
                        case 5:
                        if(z<10){
                            System.out.println("Ingrese el nombre de la tarea N "+z);
                            Nombre = Entrada.nextLine();
            
                            System.out.println("Ingrese la descripcion de la tarea N "+z);
                            Descripcion = Entrada.nextLine();

                            System.out.println("Ingrese la fecha (dd/mm/aaaa) de la tarea N "+z);
                            fechatarea = Entrada.nextLine();
                            
                            tareas = new Tarea (Nombre,Descripcion,fechatarea);
                            ListaDeTareas[z]=tareas;
                            
                            //Ordenamiento burbuja
                            /*
                            for(int a = 0 ; a < z ; a++ ){
                                for(int t = 0 ; t < z ; t++){
                                    if(ListaDeTareas[t].Nombre.compareTo(ListaDeTareas[t+1].Nombre)){
                                        aux= ListaDeTareas[t].Nombre;
                                        ListaDeTareas[t].Nombre = ListaDeTareas[t+1].Nombre;
                                        ListaDeTareas[t+1].Nombre= aux;
                                    }
                                }
                            }
                            */

                            z=z+1;
                        }
                        else{
                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS TAREAS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE TAREAS (10)");
                        }
                        break;
                        
                        case 6: 
                            if(contrecord<10){
                                System.out.println("Hola Ingrese el nombre del Recordatorio N "+contrecord);
                                Nombre = Entrada.nextLine();
                                
                                System.out.print("Dime la descripcion del recordatorio N "+contrecord);
                                Descripcion = Entrada.nextLine();
                                
                                System.out.print("Dime la hora (hh:mm) del recordatorio N "+contrecord);
                                Hora= Entrada.nextLine();
                
                                System.out.print("Dime la fecha (dd/mm/aaaa) del recordatorio N "+contrecord);
                                Fecha = Entrada.nextLine();
                                
                                
                                recordatorio = new Recordatorio(Nombre, Descripcion, Hora, Fecha);
                                listaDeRecordatorios[contrecord]=recordatorio;

                                // CONTADOR DE LOS RECORDATORIOS INGRESADOS
                                contrecord=contrecord+1;

                                //Ordenamiento burbuja
                                /*
                                for(int n = 0 ; n < contrecord ; n++ ){
                                    for(int u = 0 ; u < contrecord ; u++){
                                        if(listaDeRecordatorios[u].Nombre.compareTo(listaDeRecordatorios[u+1].Nombre)){
                                            aux= listaDeRecordatorios[u].Nombre;
                                            listaDeRecordatorios[u].Nombre = listaDeRecordatorios[u+1].Nombre;
                                            listaDeRecordatorios[u+1].Nombre= aux;
                                        }
                                    }
                                }
                                */
                        }
                        else{
                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS RECORDATORIOS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE RECORDATORIOS (10)");
                        }
                        break;

                        case 7:
                        if(conteventos<10){
                            System.out.println("Ingrese el nombre del Evento N "+ conteventos);
                            Nombre = Entrada.nextLine();
                            
                            System.out.println("Ingrese la descripcion del Evento N " + conteventos);
                            Descripcion = Entrada.nextLine();

                            System.out.println("Ingrese el lugar del evento N" + conteventos);
                            lugar= Entrada.nextLine();

                            System.out.println("Dime la fecha (dd/mm/aaaa) del Evento N " + conteventos);
                            fechaeventos= Entrada.nextLine();


                            eventos= new Eventos(Nombre, Descripcion, lugar, fechaeventos);
                            listaDEventos[conteventos]=eventos;

                            conteventos=conteventos+1;

                            //Ordenamiento burbuja
                            /*
                            for(int r = 0 ; r < conteventos ; r++ ){
                                for(int c = 0 ; c < conteventos ; c++){
                                    if(listaDEventos[c].Nombre.compareTo(listaDEventos[c+1].Nombre)){
                                        aux= listaDEventos[c].Nombre;
                                        listaDEventos[c].Nombre = listaDEventos[c+1].Nombre;
                                        listaDEventos[c+1].Nombre= aux;
                                    }
                                }
                            }
                            */
                        }   
                        else{
                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS EVENTOS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE EVENTOS (10)");
                        }
                        break;



                    }


            break;
            
            case 2:
                // if para saber si ya ha ingresado una tarea o un recordatorio o un evento
                if(0<z && 0<conteventos && 0<contrecord){
                    
                    System.out.println("Ingrese 5 para ver las listas de tareas");
                    System.out.println("Ingrese 6 para ver las listas de recordatorios");
                    System.out.println("Ingrese 7 para ver las listas de eventos");
                    verlistas=Entrada.nextInt();

                    while(verlistas < 5 || 7 < verlistas){
                        System.out.println("ERROR");
                        System.out.println("Ingrese 5 para ver las listas de tareas");
                        System.out.println("Ingrese 6 para ver las listas de recordatorios");
                        System.out.println("Ingrese 7 para ver las listas de eventos");
                        verlistas=Entrada.nextInt();
                    }

                        switch(verlistas){
                            case 5:
                                for(int p=0 ; p<z ; p++){
                                    System.out.println("Tarea Nº "+ p);
                                    System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                                    System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                                    System.out.println("-----------------------");
                                }
                            break;

                            case 6:
                                for(int y=0 ; y<contrecord ; y++){
                                    System.out.println("Recordatorio Nº "+ y);
                                    System.out.println("Nombre: " + listaDeRecordatorios[y].Nombre);
                                    System.out.println("Descripcion: " + listaDeRecordatorios[y].Descripcion);
                                    System.out.println("Fecha: " + listaDeRecordatorios[y].fecha);
                                    System.out.println("Hora :" + listaDeRecordatorios[y].hora);
                                    System.out.println("-----------------------");
                                }
                            break;
                            
                            case 7:
                                for(int w=0 ; w<contrecord ; w++){
                                    System.out.println("Recordatorio Nº "+ w);
                                    System.out.println("Nombre: " + listaDEventos[w].Nombre);
                                    System.out.println("Descripcion: " + listaDEventos[w].Descripcion);
                                    System.out.println("Lugar: " + listaDEventos[w].lugar);
                                    System.out.println("Fecha: " + listaDEventos[w].fechaeventos);
                                    
                                    System.out.println("-----------------------");
                                }
                            break;

                        }
                }
            break;
    
            case 3:
            
                System.out.println("Ingrese 5 para modificar la lista de tareas");
                System.out.println("Ingrese 6  para modificar la lista de recordatorios");
                System.out.println("Ingrese 7 para modificar la lista de eventos");
                ModAgenda=Entrada.nextInt();
                Entrada.nextLine();

                switch(ModAgenda){
                    case 5:
                    //FALTA CREAR LA BUSQUEDA BINARIA PARA PODER MODIFICAR ALGO EN LA AGENDA
                        /*
                        System.out.println("Ingrese el nombre de la tarea que desea modificar");
                        ModTarea=Entrada.nextLine();

                        System.out.println("Ingrese el nuevo nombre de la tarea "+ModTarea);
                        Nombre=Entrada.nextLine();
                                            
                        System.out.print("Dime la nueva descripcion de la tarea "+ModTarea);
                        Descripcion = Entrada.nextLine();

                        tareas = new Tarea (Nombre,Descripcion);
                        ListaDeTareas[ModTarea]=tareas;
                        */
                        /*
                        // for para buscar tareas
                        for(int r = 0 ; r < z ; r++ ){
                            int inicio = 0;
                            int fin = z;
                            int mitad = (inicio+fin)/2;

                            while(ModTarea ){
                                
                                
                            }

                        }
                        */
                        

                    break;

                    case 6:

                    break;

                    case 7:

                    break;
                            
           
                    }
            break;

        case 0:
                ent=0;
                Entrada.close();

        break;
       
    
    }
} while((ent != 0) && (z!=10||conteventos!=10||contrecord!=10));
}
}