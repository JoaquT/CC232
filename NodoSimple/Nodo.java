public class Nodo{
    private int valor;
    private Nodo next;
    public Nodo(int valor){
        this.valor = valor;
        next = null;
    }
    int getvalor(){return valor;}
    void setvalor(int valor){this.valor=valor;}
    Nodo getnext(){return next;}
    void setnext(Nodo next){this.next = next;}
}