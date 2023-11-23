package Different;
import pack1.A;
public class Main1 {
    public static void main(String[] args) {
        A objA=new A();
        objA.displayA();
        A.B objB=objA.new B();
        objB.displayB();
    }
}
