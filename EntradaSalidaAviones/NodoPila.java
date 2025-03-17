public class NodoPila{
    private final String nameavion;
    private NodoPila next;
    
    public NodoPila(String nameavion){
        this.nameavion = nameavion;
        next = null;
    }
    void setnext(NodoPila next){this.next = next;}
    NodoPila getnext(){return next;}
    String getname(){return nameavion;}
}