import static java.lang.Math.pow;
import java.util.Scanner;
class ArbolB{
    public Scanner sc = new Scanner(System.in);
    private TreeNode raiz;
    public ArbolB(){
        raiz = null;
    }
    boolean esVacio(){
        return raiz==null;       
    }
    void setraiz(TreeNode n){
        raiz = n;
    }
    TreeNode getRaiz(){
        return raiz;
    }
    TreeNode getHizq(){
        return raiz.getizq();
    }
    TreeNode getHder(){
        return raiz.getder();
    }
    TreeNode nuevoArbol(TreeNode izq,String dato,TreeNode der){
        return new TreeNode(izq,dato,der);
    }
    void crearArbol(){
    System.out.println("Cuantos niveles desea crear");
    int niveles;
    int n = 0;
    try {
        niveles = sc.nextInt();
         n = (int) pow(2,niveles) - 1;
        TreeNode [] nodos = new TreeNode[n];


    } catch (Exception e) {
        System.out.println(e);
        System.exit(1);
    }
    ArbolB [] a = new ArbolB[n];
    
    }
}