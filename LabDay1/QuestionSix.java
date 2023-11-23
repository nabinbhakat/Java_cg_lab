import java.util.*;
public class QuestionSix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<args.length;i++){
            if(Integer.parseInt(args[i])==n){
                System.out.println(n+" is present in the array");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(n+" is not present int the array");
        sc.close();
    }
}
