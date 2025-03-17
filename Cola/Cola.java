public class Cola{
    private NodoCola head;
    private NodoCola tail;
    
    public Cola(){
        head = tail = null;
    }
    void insertar(int num){
        NodoCola nuevo = new NodoCola(num);
        if(head==null){
            head = tail = nuevo;
            return;
        }
        NodoCola curr = head;
        while(curr.getnext()!=null){
            curr = curr.getnext();
        }
        tail = nuevo;
        curr.setnext(nuevo);
    }
    int quitar(){
        if(head==null){
            throw new RuntimeException("Cola vacia");
        }
        int valorRetorno = head.getdato();
        head = head.getnext();
        return valorRetorno;
    }
    int getDatoFrente(){
        if(head==null){
            throw new RuntimeException("Cola vacia");
        }
        return head.getdato();
    }
    int getDatoFinal(){
        if(tail==null){
            throw new RuntimeException("Cola vacia");
        }
        return tail.getdato();
    }
    boolean colaVacia(){
        return head==null && tail==null;
    }
    NodoCola getFrente(){
        return head;
    }
    NodoCola getFinal(){
        return tail;
    }
    void verCola(){
        while(head!=null && tail!=null){
            System.out.println("quitando nodo: "+ quitar());
        }
    }



}