import java.util.Scanner;
public class ListaCircular{
    private NodoCircular head;
    public Scanner sc;
    public ListaCircular(){
        head = null;
    }
    void insertarAcceso(int x){
        NodoCircular nuevo = new NodoCircular(x);
        if(head==null){
            head = nuevo;
        }else{
            NodoCircular temp = head;
            while(temp.getnext()!=head){
                temp = temp.getnext();
            }
            temp.setnext(nuevo);
            nuevo.setnext(head);
            head = nuevo;           
        }
        
    }
    void crearLista(){
        int x;
        sc = new Scanner(System.in);
        System.out.println("termina con -1");
        do{
            x = sc.nextInt();
            if(x!=-1){
                insertarAcceso(x);
            }  
        }while(x!=-1);
        
    }
void insertardespues(int objetivo, int insertar) {
    if (head == null) {
        System.out.println("La lista está vacía");
        return;
    }

    NodoCircular curr = head;
    NodoCircular nuevo = new NodoCircular(insertar);

    // Buscar el nodo donde insertar
    while (curr.getdato() != objetivo) {
        curr = curr.getnext();
        if (curr == head) {  // Si volvimos al inicio, el objetivo no existe
            System.out.println("No se encontró el número objetivo");
            return;
        }
    }

    // Enlazar el nuevo nodo después de `curr`
    nuevo.setnext(curr.getnext());
    curr.setnext(nuevo);

    // Si el nodo objetivo era el último antes de volver a `head`, no es necesario hacer más cambios.
}
void insertarAntes(int objetivo,int insertar){
    if(head==null){
        System.out.println("lista vacia");
        return;
    }
    NodoCircular nuevo = new NodoCircular(insertar); //1->2->3->4
    NodoCircular curr = head;
    while(curr.getnext().getdato()!=objetivo){
        curr = curr.getnext();
        if(curr == head){
            System.out.println("no se encontro el numero objetivo");
            return;
        }
    }
    if(curr.getnext()==head){
        head = nuevo;
    }
    nuevo.setnext(curr.getnext());
    curr.setnext(nuevo);
    

    
}
    void eliminar(int x){
        if(head==null){
            System.out.println("lista vacia");
            return;
        }

        NodoCircular curr = head;
        while(curr.getnext().getdato()!=x){
            curr= curr.getnext();
            if(curr == head){
                System.out.println("no se encontro el nodo a eliminar");
                return;
            }
        }
        if(curr.getnext()==head){
            head = head.getnext();
            curr.setnext(head);
        }
        curr.setnext(curr.getnext().getnext());
    }
    void modificar(int valorbuscar,int valornuevo){
        if(head==null){
            System.out.println("lista vacia");
            return;
        }
        NodoCircular curr = head;
        do { 
            if(curr.getnext()==head){
                System.out.println("No se encontro el nodo buscado");
            }
            curr = curr.getnext();
        } while (curr.getdato()!=valorbuscar);
        curr.setdato(valornuevo);
    }

    void verLista(){
        NodoCircular curr = head;
        do{
            System.out.print(curr.getdato()+" -> ");
            curr = curr.getnext();
        }while(curr!=head);
        System.out.println();
    }
}