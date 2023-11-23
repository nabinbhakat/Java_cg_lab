public class CalculatorMain {
    public static void main(String[] args) {
        Calculator<Integer> I =new Calculator<Integer>(20,30);
        Calculator<Double> D=new Calculator<Double>(12.48,2.4);
        System.out.println(I.add());
        System.out.println(D.add());
        System.out.println(I.subtract());
        System.out.println(D.subtract());
        System.out.println(I.multiply());
        System.out.println(D.multiply());
        System.out.println(I.divide());
        System.out.println(D.divide()); 
        
    }
}
