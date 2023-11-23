public class Question_Three {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int a=0,b=1,c;
        if(n==1)
            System.out.println(a);
        else if(n==2)
            System.out.println(a+" "+b);
        else{
            for(int i=0;i<n;i++){
                c=a+b;
                System.out.print(a+" ");
                a=b;
                b=c;
            }
        }
    }
}
