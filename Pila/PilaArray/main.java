public class main{
    public static void main(String[] args) {
        PilaArr p = new PilaArr(5);
        p.push(4);
        p.push(5);
        System.out.println(p.peek());
        System.out.println(p.tampila());
    }
}