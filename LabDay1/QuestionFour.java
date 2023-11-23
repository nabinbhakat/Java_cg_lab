public class QuestionFour {
    public static void main(String[] args) {
        for(int i=1;i<args.length;i++){
            int j=i-1;
            while(j>=0 && Integer.parseInt(args[j+1])<Integer.parseInt(args[j])){
                String t=args[j];
                args[j]=args[j+1];
                args[j+1]=t;
                j--;
            }
        }
        for(int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
        }
    }
}
