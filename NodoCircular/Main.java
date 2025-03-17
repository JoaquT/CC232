public class Main{
    public static void main(String[] args) {
        ListaCircular l = new ListaCircular();
        l.crearLista();
        l.verLista();
        l.insertarAcceso(6);
        l.verLista();
        l.insertarAntes(6,10);
        l.verLista();
        l.modificar(5, 8);
        l.verLista();
    }
}