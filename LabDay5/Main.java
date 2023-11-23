public class Main {
    public static void main(String[] args) {
        Iface1 ob1= Iface1.createConcrete();
        ob1.im1();
        ob1.dm1();
        Iface1 ob2= Iface1.createConcrete2();
        ob2.im1();
        ob2.dm1();
    }
}
