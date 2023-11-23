public class QuestionFive {
    public static void main(String[] args) {
        int flag=0;
        String s=args[0];
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                System.out.println(args[0]+ "is not a palindromic string");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(args[0]+" is a paliondromic string");
    }
}
