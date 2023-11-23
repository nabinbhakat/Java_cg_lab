public class Excption {
    void m1(){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
            int arr[]=new int[5];
            arr[7]=5;
            System.out.println("In m1");
        }
        catch(ArithmeticException e){
            System.out.println("In AE Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("In AIOBE Exception");
        }
        
    }
    public static void main(String[] args) {
        Excption ex= new Excption();
        ex.m1();
        System.out.println("In main");
    }
}
