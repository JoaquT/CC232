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
    }
    int getday(){return day;}
    int getmonth(){return month;}
    int getyear(){return year;}
    int getpeso(){return peso;}
    Producto getnext(){return next;}
    void setnext(Producto next){
        this.next = next;
    }

}