import java.util.Scanner;
import java.lang.*;
public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        ArbolB []a = new ArbolB[15];
        for(int i=0;i<15;i++){
            a[i] = new ArbolB();
        }
        ArbolB ar = new ArbolB();
        TreeNode []n = new TreeNode[15];
        //Nivel 3
        n[0] = a[0].nuevoArbol(null, "Benito", null);
        n[1] = a[1].nuevoArbol(null, "Federico", null);
        n[2] = a[2].nuevoArbol(null, "Rosa", null);
        n[3] = a[3].nuevoArbol(null, "Luis", null);
        n[4] = a[4].nuevoArbol(null, "Pedro", null);
        n[5] = a[5].nuevoArbol(null, "Ramon", null);
        n[6] = a[6].nuevoArbol(null, "Zulema", null);
        n[7] = a[7].nuevoArbol(null, "Pamela", null);
        //Nivel 2
        n[8] = a[8].nuevoArbol(n[0], "Maria", n[1]);
        n[9] = a[9].nuevoArbol(n[2], "Rodrigo", n[3]);
        n[10] = a[10].nuevoArbol(n[4], "Anyora", n[5]);
        n[11] = a[11].nuevoArbol(n[6], "Abel", n[7]);
        //Nivel 1
        n[12] = a[12].nuevoArbol(n[8], "Isabel", n[9]);
        n[13] = a[13].nuevoArbol(n[10], "Jesus", n[11]);
        //Nivel 0
        n[14] = a[14].nuevoArbol(n[12], "Esperanza", n[13]);
        ar.setraiz(n[14]);
        //Mostrar arbol
        System.out.println("Nivel 0");
        System.out.println(ar.getRaiz().getdato());
        System.out.println("Nivel 1");
        System.out.println(ar.getRaiz().getizq().getdato()+"  "+ar.getRaiz().getder().getdato());
        System.out.println("Nivel 2");
        System.out.println(ar.getRaiz().getizq().getizq().getdato()+"  "+ar.getRaiz().getizq().getder().getdato()+"  "+ar.getRaiz().getder().getizq().getdato()+"  "+ar.getRaiz().getder().getder().getdato());
        System.out.println("Nivel 3");
        System.out.println(ar.getRaiz().getizq().getizq().getizq().getdato()+"  "+ar.getRaiz().getizq().getizq().getder().getdato()+"  "+ar.getRaiz().getizq().getder().getizq().getdato()+"  "+ar.getRaiz().getizq().getder().getder().getdato()+"  "+ar.getRaiz().getder().getizq().getizq().getdato()+"  "+ar.getRaiz().getder().getizq().getder().getdato()+"  "+ar.getRaiz().getder().getder().getizq().getdato()+"  "+ar.getRaiz().getder().getder().getder().getdato());
    */
    System.out.println("Cuantos niveles desea crear");
    int niveles = sc.nextInt();
    for(int i=0;i<pow(2,niveles)-1;i++)




    }
}