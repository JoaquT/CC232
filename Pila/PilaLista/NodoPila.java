class NodoPila{
    private int valor;
    private NodoPila next;
    public NodoPila(int valor){
        this.valor = valor;
        this.next = null;
    }
    int getvalor(){
        return valor;
    }
    NodoPila getnext(){
        return next;
    }
    void setnext(NodoPila next){
        this.next = next;
    }
    
}