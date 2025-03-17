import java.util.Scanner;
public class ListaSimple{
    public Scanner sc = new Scanner(System.in);
    private Nodo head;
    public ListaSimple(){
        head = null;
    }
    public void insertarNodo(int x){
        Nodo nuevo = new Nodo(x);
        Nodo curr = head;
        if(head==null){
            head = nuevo;
            return;
        }
        while(curr.getnext()!=null){
            curr = curr.getnext();
        }
        curr.setnext(nuevo);


    }


    public void crearLista(){
        System.out.println("digitar -1 para terminar");
        int x;
        do { 
            x = sc.nextInt();
            if(x!=-1){
                insertarNodo(x);
            }
        } while (x!=-1);

    }
    public void ordenarLista(){
        if(head==null || head.getnext()==null) return;
        boolean cambio;
        do { 
            cambio = false;
            Nodo prev = null;
            Nodo curr = head;
            while(curr.getnext()!=null){ //4->1->5->3->7     1->4->5->3->7   1->4->3->5->7
                Nodo next = curr.getnext();
                if(curr.getvalor()>next.getvalor()){
                    cambio = true;
                    curr.setnext(next.getnext());
                    next.setnext(curr);
                    if(prev == null){
                        head = next;
                    }else{
                        prev.setnext(next);
                    }
                    prev = next;

                }else{
                    prev = curr;
                    curr = curr.getnext();
                }
            }



        } while (cambio);
    
    }

}
