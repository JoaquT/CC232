public class NodoCircular{
    private int dato;
    private NodoCircular next;
    public NodoCircular(int dato){
        this.dato = dato;
        this.next = this;
    }
    int getdato(){return dato;}
    void setdato(int dato){this.dato = dato;}
    NodoCircular getnext(){return next;}
    void setnext(NodoCircular next){this.next = next;}
}