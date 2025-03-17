public class TreeNode{
    private String dato;
    private TreeNode izq;
    private TreeNode der;
    public TreeNode(TreeNode izq,String dato,TreeNode der){
        this.dato = dato;
        this.izq = izq;
        this.der = der;

    }
    String getdato(){
        return dato;
    }
    TreeNode getizq(){
        return izq;
    }
    TreeNode getder(){
        return der;
    }
    void setdato(String dato){
        this.dato = dato;
    }
    void setizq(TreeNode izq){
        this.izq = izq;
    }
    void setder(TreeNode der){
        this.der = der;
    }
    
}