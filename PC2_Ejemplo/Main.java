import java.util.Scanner;
public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ListaProducto l = new ListaProducto();
        while(true){
            System.out.println("1. Crear Lista");
            System.out.println("2. Ver Lista");
            System.out.println("3. Ordenar Lista");
            System.out.println("4. Salir");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1 -> l.crearLista();
                case 2 -> l.verLista();
                case 3 -> l.ordenarLista();
                case 4 -> {
                }
                default -> System.out.println("Digite una opcion valida 1-2-3-4");    
            }
            if(opcion==4){break;}
            

        }
    }
}