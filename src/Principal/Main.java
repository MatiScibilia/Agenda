/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import java.util.Scanner;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
/**
 *
 * @author Mati
 * 
 
 */
//probando


public class Main {
    public static void main(String[] args) {
        
       Scanner Entrada= new Scanner(System.in);
      // LocalDateTime now = LocalDateTime.now();

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
       String Nombre="0";
       String Descripcion="0";
       String  Hora="0";
       String Fecha="0";
       String fechatarea="0";
       String lugar="0";
       String fechaeventos="0";

     

       //VARIABLE PARA EL MENU PRINCIPAL
       int ent=0;
       //VARIABLE PARA MODIFICAR ALGO EN LA AGENDA
       int ModAgenda=0;
       //VARIABLE PARA MODIFICAR LA LISTA DE TAREAS
       int ModTarea=0;
       //VARIABLE PARA MODIFICAR LA LISTA DE RECORDATORIOS
       int ModRecordatorio=0;
       //VARIABLE PARA MODIFICAR LA LISTA DE EVENTOS
       int ModEventos=0;
       // CONTADOR DE TAREAS INGRESADAS
       int z=0;
       //CONTADOR DE RECORDATORIOS INGRESADOS
       int contrecord=0;
       // CONTADOR DE EVENTOS INGRESADOS
       int conteventos=0;
       //variable para elegir cargar una nueva tarea,recordatorio o evento
       int tipo=0;
       // VARIABLE PARA VER LAS LISTAS DE TAREAS O RECORDATORIOS O EVENTOS
       int verlistas=0;
       // Variable para eliminar una tarea 
        int elimtarea=0;
        //variable para eliminar un recordatorio
        int elimrecord=0;
        //variable para eliminar un evento
        int elimevento=0;
        // variable para saber que tarea modificar
        int numtarea = 0;
        // variable para saber que recordatorio modificar
        int numrecord=0;
        //variable para saber que recordatorio modificar
        int numevento=0;
       //String aux="0";
      
       //VARIABLE PARA LIMPIAR BUFFER Y SE INGRESEN CORRECTAMENTE LOS DATOS 
       String c="0";
       
      do{
      
        System.out.println("Ingrese 1 para cargar una nueva tarea,evento o recordatorio en la agenda");
        System.out.println("Ingrese 2 para mostrar la lista de tareas, eventos o recordatorios");
        System.out.println("Ingrese 3 para modificar algo en la agenda");
        System.out.println("Ingrese 0 para salir");

        ent=Entrada.nextInt();
        Entrada.nextLine();

        //para borrar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();
      
        while(ent < 0 || 3 < ent){
            //para borrar pantalla
            System.out.print("\033[H\033[2J");
            System.out.flush();

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
                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("ERROR");
                    System.out.println("Ingrese 5 para crear una nueva tarea");
                    System.out.println("Ingrese 6 para crear un nuevo recordatorio");
                    System.out.println("Ingrese 7 para crear un nuevo evento");
                    tipo= Entrada.nextInt();

                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                }

                //para borrar pantalla
                System.out.print("\033[H\033[2J");
                System.out.flush();
                    
                    switch(tipo){
                        
                        case 5:
                        if(z<10){
                            System.out.println("------------------------");
                            //Variable para limpiar el buffer
                            c=Entrada.nextLine();

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
                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            z=z+1;
                        }
                        else{

                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS TAREAS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE TAREAS (10)");
                        }
                        break;
                        
                        case 6: 
                            if(contrecord<10){

                                System.out.println("------------------------");
                                //Variable para limpiar el buffer
                                c=Entrada.nextLine();

                                System.out.println("Hola Ingrese el nombre del Recordatorio N "+contrecord);
                                Nombre = Entrada.nextLine();
                                
                                
                                System.out.println("Dime la descripcion del recordatorio N "+contrecord);
                                Descripcion = Entrada.nextLine();
                                
                                System.out.println("Dime la hora (hh:mm) del recordatorio N "+contrecord);
                                Hora= Entrada.nextLine();
                
                                System.out.println("Dime la fecha (dd/mm/aaaa) del recordatorio N "+contrecord);
                                Fecha = Entrada.nextLine();
                                
                                
                                recordatorio = new Recordatorio(Nombre, Descripcion, Hora, Fecha);
                                listaDeRecordatorios[contrecord]=recordatorio;

                                // CONTADOR DE LOS RECORDATORIOS INGRESADOS
                                contrecord=contrecord+1;

                                 //para borrar pantalla
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

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

                             //para borrar pantalla
                             System.out.print("\033[H\033[2J");
                             System.out.flush();

                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS RECORDATORIOS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE RECORDATORIOS (10)");
                        }
                        break;

                        case 7:
                        if(conteventos<10){

                            System.out.println("------------------------");
                            //Variable para limpiar el buffer
                            c=Entrada.nextLine();

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

                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

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
                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("ERROR. YA NO SE PUEDEN CARGAR MAS EVENTOS");
                            System.out.println("USTED A CARGADO EL MAXIMO DE EVENTOS (10)");
                        }
                        break;



                    }


            break;
            
            case 2:
                // if para saber si ya ha ingresado una tarea o un recordatorio o un evento
                if(0 < z || 0 < conteventos || 0 < contrecord){
                    
                    System.out.println("Ingrese 5 para ver las listas de tareas");
                    System.out.println("Ingrese 6 para ver las listas de recordatorios");
                    System.out.println("Ingrese 7 para ver las listas de eventos");
                    verlistas=Entrada.nextInt();

                    while(verlistas < 5 || 7 < verlistas){
                         //para borrar pantalla
                         System.out.print("\033[H\033[2J");
                         System.out.flush();

                        System.out.println("ERROR");
                        System.out.println("Ingrese 5 para ver las listas de tareas");
                        System.out.println("Ingrese 6 para ver las listas de recordatorios");
                        System.out.println("Ingrese 7 para ver las listas de eventos");
                        verlistas=Entrada.nextInt();

                         //para borrar pantalla
                         System.out.print("\033[H\033[2J");
                         System.out.flush();
                    }

                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                        switch(verlistas){
                            case 5:
                                if(0<z){
                                    for(int p=0 ; p<z ; p++){
                                        System.out.println("-----------------------");
                                        System.out.println("Tarea N?? "+ p);
                                        System.out.println("Nombre: " + ListaDeTareas[p].Nombre);
                                        System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                                        System.out.println("Fecha: " + ListaDeTareas[p].fechatarea);
                                        System.out.println("-----------------------");
                                    }
                                }else{

                                    //para borrar pantalla
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    System.out.println("ERROR. NO SE HA ENCONTRADO TAREAS CARGADOS");
                                }
                            break;

                            case 6:
                                if(0<contrecord){

                                    for(int y=0 ; y < contrecord ; y++){
                                        System.out.println("-----------------------");
                                        System.out.println("Recordatorio N?? "+ y);
                                        System.out.println("Nombre: " + listaDeRecordatorios[y].Nombre);
                                        System.out.println("Descripcion: " + listaDeRecordatorios[y].Descripcion);
                                        System.out.println("Fecha: " + listaDeRecordatorios[y].fecha);
                                        System.out.println("Hora :" + listaDeRecordatorios[y].hora);
                                        System.out.println("-----------------------");
                                    }
                                }else{
                                    //para borrar pantalla
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    System.out.println("ERROR. NO SE HA ENCONTRADO RECORDATORIOS CARGADOS");
                                }
                            break;
                            
                            case 7:
                                if(0<conteventos){
                                    for(int w=0 ; w<conteventos ; w++){
                                        System.out.println("-----------------------");
                                        System.out.println("Evento N?? "+ w);
                                        System.out.println("Nombre: " + listaDEventos[w].Nombre);
                                        System.out.println("Descripcion: " + listaDEventos[w].Descripcion);
                                        System.out.println("Lugar: " + listaDEventos[w].lugar);
                                        System.out.println("Fecha: " + listaDEventos[w].fechaeventos);
                                        
                                        System.out.println("-----------------------");
                                    }
                                }else{

                                    //para borrar pantalla
                                    System.out.print("\033[H\033[2J");
                                    System.out.flush();

                                    System.out.println("ERROR. NO SE HA ENCONTRADO EVENTOS CARGADOS");
                                }
                            break;

                        }
                }else{
                     //para borrar pantalla
                     System.out.print("\033[H\033[2J");
                     System.out.flush();

                    System.out.println("ERROR NO SE HA CARGADO NADA EN LA AGENDA");
                    System.out.println("------------------------");
                }
            break;
    
            case 3:
            if(0 < z || 0 < conteventos || 0 < contrecord){
                System.out.println("Ingrese 5 para modificar o eliminar la lista de tareas");
                System.out.println("Ingrese 6  para modificar o eliminar la lista de recordatorios");
                System.out.println("Ingrese 7 para modificar o eliminar la lista de eventos");
                ModAgenda=Entrada.nextInt();
                Entrada.nextLine();

                while(ModAgenda < 5 || 7 < ModAgenda){
                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Ingrese 5 para modificar o eliminar la lista de tareas");
                    System.out.println("Ingrese 6  para modificar o eliminar la lista de recordatorios");
                    System.out.println("Ingrese 7 para modificar o eliminar la lista de eventos");
                    ModAgenda=Entrada.nextInt();
                    Entrada.nextLine();

                    //para borrar pantalla
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
               }

                //para borrar pantalla
                System.out.print("\033[H\033[2J");
                System.out.flush();

                switch(ModAgenda){
                    case 5:
                    //FALTA CREAR LA BUSQUEDA BINARIA PARA PODER MODIFICAR ALGO EN LA AGENDA
                        
                        System.out.println("Ingrese 1 si quiere eliminar una tarea");
                        System.out.println("Ingrese 2 para modificar una tarea");
                        ModTarea=Entrada.nextInt();

                        while(ModTarea < 1 || 2 < ModTarea){

                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("ERROR.");
                            System.out.println("Ingrese 1 si quiere eliminar una tarea");
                            System.out.println("Ingrese 2 para modificar una tarea");
                            ModTarea=Entrada.nextInt();

                            //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                        }

                            if(ModTarea==1){
                                if(0<z){

                                    for(int p=0 ; p<z ; p++){
                                        System.out.println("-----------------------");
                                        System.out.println("Tarea N?? "+ p);
                                        System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                                        System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                                        System.out.println("Fecha: " + ListaDeTareas[p].fechatarea);
                                        System.out.println("-----------------------");
                                    }
                                    
                                    System.out.println("Ingrese el numero de tarea que desea eliminar");
                                    elimtarea=Entrada.nextInt();
                                    
                                    while(elimtarea < 0 || z < elimtarea){

                                        System.out.println("ERROR.");

                                        for(int p=0 ; p<z ; p++){
                                            System.out.println("-----------------------");
                                            System.out.println("Tarea N?? "+ p);
                                            System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                                            System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                                            System.out.println("Fecha: " + ListaDeTareas[p].fechatarea);
                                            System.out.println("-----------------------");
                                        }

                                        System.out.println("Ingrese el numero de la tarea que desea modificar");
                                        numtarea=Entrada.nextInt();
                                    }

                                    

                                    ListaDeTareas[elimtarea].Nombre="0";
                                    ListaDeTareas[elimtarea].Descripcion="0";
                                    ListaDeTareas[elimtarea].fechatarea="0";

                                    for(int d=0 ; d < z ; d++){
                                        if(d == z-1){
                                            d=100;
                                            
                                        }else{
                                            if(ListaDeTareas[d].Nombre=="0"){
                                                ListaDeTareas[d].Nombre=ListaDeTareas[d+1].Nombre;
                                                ListaDeTareas[d].Descripcion=ListaDeTareas[d+1].Descripcion;
                                                ListaDeTareas[d].fechatarea=ListaDeTareas[d+1].fechatarea;

                                                ListaDeTareas[d+1].Nombre="0";
                                                ListaDeTareas[d+1].Descripcion="0";
                                                ListaDeTareas[d+1].fechatarea="0";
                                            }
                                        }

                                    }
  

                                    z=z-1;

                                    System.out.println("Se ha borrado correctamente la tarea N " + elimtarea);
                                 }else{
                                     System.out.println("ERROR. NO HAY TAREAS CARGADAS");
                                 }
                            }else{

                                for(int p=0 ; p<z ; p++){
                                    System.out.println("-----------------------");
                                    System.out.println("Tarea N?? "+ p);
                                    System.out.println("Nombre: "+ListaDeTareas[p].Nombre);
                                    System.out.println("Descripcion: "+ListaDeTareas[p].Descripcion);
                                    System.out.println("-----------------------");
                                }

                                

                                System.out.println("Ingrese el numero de la tarea que desea modificar");
                                numtarea=Entrada.nextInt();

                                while(numtarea < 0 || z < numtarea){
                                    System.out.println("ERROR");
                                    System.out.println("Ingrese el numero de la tarea que desea modificar");
                                    numtarea=Entrada.nextInt();
                                }

                                System.out.println("------------------------");
                                //Variable para limpiar el buffer
                                c=Entrada.nextLine();

                                System.out.println("Ingrese el nuevo nombre de la tarea N?? " + numtarea);
                                ListaDeTareas[numtarea].Nombre=Entrada.nextLine();
                                System.out.println("Ingrese la nueva descripcion de la tarea N?? " + numtarea);
                                ListaDeTareas[numtarea].Descripcion=Entrada.nextLine();
                                System.out.println("Ingrese la nueva fecha de la tarea N?? " + numtarea);
                                ListaDeTareas[numtarea].fechatarea=Entrada.nextLine();

                                System.out.println("Se cambiaron los datos de la tarea correctamente");
                                
                            }
                    
                    
                    
                    
                    
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
                    System.out.println("Ingrese 1 si quiere eliminar un recordatorio");
                    System.out.println("Ingrese 2 para modificar un recordatorio");
                    ModRecordatorio = Entrada.nextInt();

                    while(ModRecordatorio < 1 || 2 < ModRecordatorio){

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Ingrese 1 si quiere eliminar un recordatorio");
                        System.out.println("Ingrese 2 para modificar un recordatorio");
                        ModRecordatorio = Entrada.nextInt();

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }
                    
                    if(ModRecordatorio==1){
                        if(0<contrecord){
                            for(int y = 0 ; y < contrecord ; y++){
                                System.out.println("-----------------------");
                                System.out.println("Recordatorio N?? "+ y);
                                System.out.println("Nombre: " + listaDeRecordatorios[y].Nombre);
                                System.out.println("Descripcion: " + listaDeRecordatorios[y].Descripcion);
                                System.out.println("Fecha: " + listaDeRecordatorios[y].fecha);
                                System.out.println("Hora :" + listaDeRecordatorios[y].hora);
                                System.out.println("-----------------------");
                            }

                            System.out.println("Ingrese el numero del recordatorio que desea eliminar");
                            elimrecord=Entrada.nextInt();

                            while(elimrecord < 0 || contrecord<elimrecord ){
                                System.out.println("ERROR");
                                System.out.println("Ingrese el numero del recordatorio que desea eliminar");
                                elimrecord=Entrada.nextInt();
                            }
                            
                            listaDeRecordatorios[elimrecord].Nombre="0";
                            listaDeRecordatorios[elimrecord].Descripcion="0";
                            listaDeRecordatorios[elimrecord].fecha="0";
                            listaDeRecordatorios[elimrecord].hora="0";

                            for(int n=0 ; n < contrecord ; n++){
                                if(n == contrecord-1){
                                    n=100;
                                }else{

                                    if(ListaDeTareas[n].Nombre=="0"){
                                        
                                        listaDeRecordatorios[n].Nombre = listaDeRecordatorios[n+1].Nombre;
                                        listaDeRecordatorios[n].Descripcion = listaDeRecordatorios[n+1].Descripcion;
                                        listaDeRecordatorios[n].fecha = listaDeRecordatorios[n+1].fecha;
                                        listaDeRecordatorios[n].hora = listaDeRecordatorios[n+1].hora;

                                        listaDeRecordatorios[n+1].Nombre="0";
                                        listaDeRecordatorios[n+1].Descripcion="0";
                                        listaDeRecordatorios[n+1].fecha="0";
                                        listaDeRecordatorios[n+1].hora="0";

                                    }
                                }

                            }

                            contrecord=contrecord-1;

                            System.out.println("Se ha borrado correctamente el recordatorio N " + elimrecord);

                        }else{
                            System.out.println("ERROR. NO SE HAN CARGADO RECORDATORIOS AUN");
                        }


                    }else{

                        for(int g = 0 ; g < contrecord ; g++){
                            System.out.println("-----------------------");
                            System.out.println("Recordatorio N?? "+ g);
                            System.out.println("Nombre: " + listaDeRecordatorios[g].Nombre);
                            System.out.println("Descripcion: " + listaDeRecordatorios[g].Descripcion);
                            System.out.println("Fecha: " + listaDeRecordatorios[g].fecha);
                            System.out.println("Hora :" + listaDeRecordatorios[g].hora);
                            System.out.println("-----------------------");
                        }

                        System.out.println("Ingrese el numero del recordatorio que desea modificar");
                        numrecord=Entrada.nextInt();

                        while(numrecord < 0 || contrecord < numrecord){
                            System.out.println("ERROR");
                            System.out.println("Ingrese el numero del recordatorio que desea modificar");
                            numtarea=Entrada.nextInt();
                        }

                        System.out.println("------------------------");
                        //Variable para limpiar el buffer
                        c=Entrada.nextLine();


                        System.out.println("Ingrese el nuevo nombre del recordatorio N?? " + numrecord);
                        listaDeRecordatorios[numrecord].Nombre=Entrada.nextLine();
                        System.out.println("Ingrese la nueva descripcion del recordatorio N?? " + numrecord);
                        listaDeRecordatorios[numrecord].Descripcion=Entrada.nextLine();
                        System.out.println("Ingrese la nueva fecha del recordatorio N?? " + numrecord);
                        listaDeRecordatorios[numrecord].fecha=Entrada.nextLine();
                        System.out.println("Ingrese la nueva hora del recordatorio N?? " + numrecord);
                        listaDeRecordatorios[numrecord].hora=Entrada.nextLine();

                        System.out.println("Se cambiaron los datos de la tarea correctamente");
                        System.out.println("------------------------");
                    }

                    break;

                    case 7:

                    System.out.println("Ingrese 1 si quiere eliminar un evento");
                    System.out.println("Ingrese 2 para modificar un evento");
                    ModEventos = Entrada.nextInt();

                    while(ModEventos < 1 || 2 < ModEventos){

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Ingrese 1 si quiere eliminar un evento");
                        System.out.println("Ingrese 2 para modificar un evento");
                        ModEventos = Entrada.nextInt();

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                    }
                    
                    
                    if(ModEventos==1){
                        if(0<conteventos){
                            for(int i = 0 ; i < conteventos ; i++){
                                System.out.println("-----------------------");
                                System.out.println("Evento N?? "+ i);
                                System.out.println("Nombre: " + listaDEventos[i].Nombre);
                                System.out.println("Descripcion: " + listaDEventos[i].Descripcion);
                                System.out.println("Lugar: " + listaDEventos[i].lugar);
                                System.out.println("Fecha: " + listaDEventos[i].fechaeventos);
                                
                                System.out.println("-----------------------");
                            }

                            System.out.println("Ingrese el numero del evento que desea eliminar");
                            elimevento=Entrada.nextInt();

                            while(elimevento < 0 || conteventos<elimevento ){
                                System.out.println("ERROR");
                                System.out.println("Ingrese el numero del evento que desea eliminar");
                                elimevento=Entrada.nextInt();
                            }
                            
                            listaDEventos[elimevento].Nombre="0";
                            listaDEventos[elimevento].Descripcion="0";
                            listaDEventos[elimevento].fechaeventos="0";
                            listaDEventos[elimevento].lugar="0";

                            for(int j=0 ; j < conteventos ; j++){
                                if(j == conteventos-1){
                                    j=100;
                                }else{

                                    if(listaDEventos[j].Nombre=="0"){
                                    
                                        listaDEventos[j].Nombre=listaDEventos[j+1].Nombre;
                                        listaDEventos[j].Descripcion=listaDEventos[j+1].Descripcion;
                                        listaDEventos[j].fechaeventos=listaDEventos[j+1].fechaeventos;
                                        listaDEventos[j].lugar=listaDEventos[j+1].lugar;
    
                                        listaDEventos[j+1].Nombre="0";
                                        listaDEventos[j+1].Descripcion="0";
                                        listaDEventos[j+1].fechaeventos="0";
                                        listaDEventos[j+1].lugar="0";
    
    
                                        
                                    }
                                }
                            }

                            conteventos=conteventos-1;

                             //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("Se ha borrado correctamente el evento N " + elimevento);
                            System.out.println("-----------------------");

                        }else{

                             //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("ERROR. NO SE HAN CARGADO EVENTOS AUN");
                            System.out.println("-----------------------");
                        }


                    }else{

                        for(int s = 0 ; s < conteventos; s++){
                            System.out.println("-----------------------");
                            System.out.println("Evento N?? "+ s);
                            System.out.println("Nombre: " + listaDEventos[s].Nombre);
                            System.out.println("Descripcion: " + listaDEventos[s].Descripcion);
                            System.out.println("Lugar: " + listaDEventos[s].lugar);
                            System.out.println("Fecha: " + listaDEventos[s].fechaeventos);
                            
                            System.out.println("-----------------------");
                        }

                        System.out.println("Ingrese el numero del evento que desea modificar");
                        numevento=Entrada.nextInt();

                        while(numevento < 0 || conteventos< numevento){
                             //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();

                            System.out.println("ERROR");
                            System.out.println("Ingrese el numero del evento que desea modificar");
                            numevento=Entrada.nextInt();

                             //para borrar pantalla
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        }

                        System.out.println("------------------------");
                        //Variable para limpiar el buffer
                        c=Entrada.nextLine();

                        System.out.println("Ingrese el nuevo nombre del evento N?? " + numevento);
                        listaDEventos[numevento].Nombre=Entrada.nextLine();
                        System.out.println("Ingrese la nueva descripcion del evento N?? " + numevento);
                        listaDEventos[numevento].Descripcion=Entrada.nextLine();
                        System.out.println("Ingrese la nueva fecha del evento N?? " + numevento);
                        listaDEventos[elimevento].fechaeventos=Entrada.nextLine();
                        System.out.println("Ingrese el nuevo lugar del evento N?? " + numevento);
                        listaDEventos[elimevento].lugar=Entrada.nextLine();

                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Se cambiaron los datos de la tarea correctamente");
                        System.out.println("------------------------");
                    }
                        
                    break;
                            
                    }
                    }else{
                        //para borrar pantalla
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("ERROR. NO SE HAN CARGADO DATOS EN LA AGENDA");
                        System.out.println("------------------------");
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