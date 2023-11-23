import java.util.*;
public class QuestionNine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);
        System.out.println("Enter a symbol for operation:");
        String s=sc.next();
        switch(s){
            case "+":   System.out.println("Result: "+x +" + "+y+" = "+(x+y)); 
                        break;
            case "-":   System.out.println("Result: "+x +" - "+y+" = "+(x-y));
                        break;
            case "*":   System.out.println("Result: "+x +" * "+y+" = "+(x*y));
                        break;
            case "/":   System.out.println("Result: "+x +" / "+y+" = "+(x/y));
                        break;
            case "%":   System.out.println("Result: "+x +" % "+y+" = "+(x%y));
                        break;
            default:    System.out.println("Wrong Choice");
        }
        sc.close();
    }
}