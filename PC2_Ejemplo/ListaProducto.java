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
        System.out.println("Lista creada");
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
       head = mergeSort(head);
       System.out.println("Productos ordenados por fecha");
    }
    public  Producto getMiddle(Producto head) {
        if (head == null) return head;
        Producto slow = head, fast = head;
    
        while (fast.getnext() != null && fast.getnext().getnext() != null) {
            slow = slow.getnext();
            fast = fast.getnext().getnext();
        }
        return slow;
    }
    public Producto merge(Producto left, Producto right) {
        Producto dummy = new Producto(0, 0, 0, 0); // nodo temporal
        Producto tail = dummy;
    
        while (left != null && right != null) {
            if (left.compareTo(right)) {
                tail.setnext(left);
                left = left.getnext();
            } else {
                tail.setnext(right);
                right = right.getnext();
            }
            tail = tail.getnext();
        }
    
        // Añadir el resto de elementos
        if (left != null) tail.setnext(left);
        if (right != null) tail.setnext(right);
    
        return dummy.getnext();
    }
    
    public  Producto mergeSort(Producto head) {
        if (head == null || head.getnext() == null) {
            return head;
        }
    
        Producto middle = getMiddle(head);
        Producto nextToMiddle = middle.getnext();
        middle.setnext(null); // divide la lista en dos
    
        Producto left = mergeSort(head);
        Producto right = mergeSort(nextToMiddle);
    
        return merge(left, right);
    }
    

    

    
    




}   