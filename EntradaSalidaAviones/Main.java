import java.util.Scanner;
public class Main{
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PilaAviones a = new PilaAviones();
    PilaAviones b = new PilaAviones();
    PilaAviones c = new PilaAviones();
    while (true) { 
        System.out.println("1. Registrar entrada de avion");
        System.out.println("2. Registrar salida de avion");
        System.out.println("3. Salir");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1 -> {
                if(a.getTam()!=3){
                    a.entradaAvion("A00"+ (a.getTam() + 1) + " X A00" + a.getTam());
                }else if(b.getTam()!=3){
                    b.entradaAvion("B00"+ (b.getTam() + 1) + " X B00" + b.getTam());
                }else if(c.getTam()!=3){
                    c.entradaAvion("C00"+ (c.getTam() + 1) + " X C00" + c.getTam());
                }
                break;
            }
            case 2 -> {
                if(c.getHead()!=null){
                    c.retirarAvion();
                }else if(b.getHead()!=null){
                    b.retirarAvion();
                }else if(a.getHead()!=null){
                    a.retirarAvion();
                }
                break;
            }
            case 3 -> {
                break;
            }
            default -> System.out.println("ingresar una opcion correcta 1-2-3");        
        }
        if(opcion==3){break;}
        a.mostrarPilas(b,c);    
    }
    
    
    }

}
    


