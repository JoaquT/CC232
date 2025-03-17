public class PilaArr{
    private int pcima;
    private int TAMPILA;
    private int[] listaPila;
    PilaArr(int TAMPILA){
        if(TAMPILA<=0){
            throw new IllegalArgumentException("El tamaño de la pila debe ser mayor que 0");
        }
        this.TAMPILA = TAMPILA;
        this.pcima = -1;
        this.listaPila = new int[TAMPILA];
    }
    public void push(int valor){
        if(pcima == TAMPILA-1){
            System.out.println("Error: Pila llena");
            return;
        }
        listaPila[++pcima] = valor;
    }
    public int pop(){
        if(pcima==-1){
            System.out.println("Error: pila vacia");
            return -1;
        }
        return listaPila[pcima--];
    }
    public int peek(){
        if(pcima==-1){
            System.out.println("error: pila vacia");
            return -1;
        }
        return listaPila[pcima];
    }
    public boolean isEmpty(){
        return pcima==-1;
    }
    public boolean isFull(){
        return pcima == TAMPILA-1;
    }
    public int tampila(){
        return pcima+1;
    }
    public void verPila(){
        while(pcima!=-1){
            System.out.println(pop());
        }
    }


}