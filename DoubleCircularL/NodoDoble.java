public class NodoDoble{
    private int valor;
    private NodoDoble prev;
    private NodoDoble next;

    public NodoDoble(int valor){
        this.valor = valor;
        this.next = this.prev = this;
    }
    int getvalor(){return valor;}
    void setvalor(int valor){this.valor = valor;}
    NodoDoble getnext(){return next;}
    void setnext(NodoDoble next){this.next = next;}
    NodoDoble getprev(){return prev;}
    void setprev(NodoDoble prev){this.prev = prev;}
}