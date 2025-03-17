public class NodoCola{
    private int dato;
    private NodoCola next;

    public NodoCola(int dato){
        this.dato = dato;
        this.next = null;
    }
    int getdato(){return dato;}
    void setdato(int dato){this.dato = dato;}
    NodoCola getnext(){return next;}
    void setnext(NodoCola next){this.next = next;}

}