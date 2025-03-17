import java.util.Random;
public class ListaProducto{
    public Random rm = new Random();
    private Producto head = null;
    public void crearLista(){
        for(int i=0;i<300;i++){
            int peso = 10 + rm.nextInt(200-10+1);
            int year = 2015 + rm.nextInt(2020-2015+1);
            int month = 1 + rm.nextInt(3-1+1);
            int day;
            if(month==1 || month==3){
                day = 1 + rm.nextInt(31-1+1); 
            }else if(month==2 && (year==2015 || year==2020)){
                day = 1 + rm.nextInt(29-1+1);
            }else{
                day = 1 + rm.nextInt(28-1+1);
            }
            Producto nuevo = new Producto(peso,day,month,year);
            Producto curr = head;
            if(head==null){
                head = nuevo;
                continue;
            }
            while(curr.getnext()!=null){
                curr =  curr.getnext();
            }
            curr.setnext(nuevo);

            
        }
    }
    public void verLista(){
        System.out.println("Direccion--------Peso--------Day--------Month---------year-------Direccion a donde apunta");
        Producto curr= head;
        while(curr!=null){
            System.out.println(curr+"   "+curr.getpeso()+"   "+curr.getday()+"   "+curr.getmonth()+"   "+curr.getyear()+"   "+curr.getnext());
            curr = curr.getnext();
        }
    }
    public void ordenarLista(){
        Producto prev = null;
        Producto curr = head;
        
    }
}