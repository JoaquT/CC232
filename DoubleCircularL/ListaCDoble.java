import java.util.Scanner;
public class ListaCDoble{
    private NodoDoble head;
    private NodoDoble tail;
    public Scanner sc;

    public ListaCDoble(){
        head=tail=null;
    }
    void agregarEntrada(int x){
        NodoDoble nuevo = new NodoDoble(x);
        if(head==null){
            head=tail=nuevo;
            return;
        }
        NodoDoble curr = head; //1->
        
        while(curr.getnext()!=head){
            curr = curr.getnext();
        }



    }
    void crearLista(int x){
        System.out.println("Digite -1 para terminar");
        do{
            x = sc.nextInt();
            if(x!=-1){
                agregarEntrada(x);
            }
        }while(x!=-1);
    }
}