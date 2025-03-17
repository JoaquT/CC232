class PilaDina{
    private NodoPila head;
    PilaDina(){
        head = null;
    }
    void insertar(int valor){
        NodoPila nuevo = new NodoPila(valor);
        nuevo.setnext(head);
        head = nuevo;
    }
    int quitar(){
        if(head==null){
            throw new RuntimeException("pila vacia");
        }
        int valor = head.getvalor();
        head = head.getnext();
        return valor;
    }
    int getcima(){
        if(head==null){
            throw new RuntimeException("pila vacia");
        }
        return head.getvalor();
    }
    boolean pilaVacia(){
        return head==null;
    }
    void limpiarPila(){
        while(head!=null){
            System.out.println("elemento removido: "+quitar());
        }
    }
    void visualizarpila(){
        while(!pilaVacia()){
            System.out.println("valor del nodo: "+quitar());
        }
    }


}