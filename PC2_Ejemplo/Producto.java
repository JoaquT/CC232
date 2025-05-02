public class Producto {
    private final int peso;
    private final int day;
    private final int month;
    private final int year;
    private Producto next;


    public Producto(int peso,int day,int month,int year){
        this.peso = peso;
        this.day = day;
        this.month = month;
        this.year = year;
        next = null;
    }
    int getday(){return day;}
    int getmonth(){return month;}
    int getyear(){return year;}
    int getpeso(){return peso;}
    Producto getnext(){return next;}
    void setnext(Producto next){
        this.next = next;
    }
    public boolean compareTo(Producto p) {
        if (this.year < p.year) return true;
        if (this.year > p.year) return false;
    
        if (this.month < p.month) return true;
        if (this.month > p.month) return false;
    
        return this.day < p.day;
    }
    
    
    

}