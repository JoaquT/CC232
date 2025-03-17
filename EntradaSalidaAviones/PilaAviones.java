public class PilaAviones{
    private NodoPila head;
    int tam;
    public PilaAviones(){
        head = null;
        tam = 0;
    }
    void entradaAvion(String name){
        NodoPila nuevo = new NodoPila(name);
        nuevo.setnext(head);
        head = nuevo;
        tam++;
    }
    void retirarAvion(){
        head = head.getnext();
        tam--;
    }
    NodoPila getHead(){
        return head;
    }
    int getTam(){
        return tam;
    }
    void desplazar(NodoPila curr){
        while(curr!=null){
            System.out.print(curr.getname()+"   ");
            curr = curr.getnext();
        }
        System.out.println();
    }
    void mostrarPilas(PilaAviones b,PilaAviones c){
        NodoPila curr = this.head;
        System.out.print("Carril1: ");
        desplazar(curr);
        System.out.print("Carril2: ");
        desplazar(b.getHead());
        System.out.print("Carril3: ");
        desplazar(c.getHead());
        System.out.println("");

    }

}