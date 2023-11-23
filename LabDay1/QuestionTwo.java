import java.util.*;
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int n=sc.nextInt();
        int fac=1;
        for(int i=2;i<=n;i++){
            fac*=i;
        }
        System.out.println("Factorial of "+n+" is "+fac);
        sc.close();
    }
}
