public class QuestionSeven {
    public static void main(String[] args) {
        String s=args[0];
        int flag=0;
        int n=0,indx=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                n+=Math.pow(2,indx);
            }
            else if(s.charAt(i)=='0'){
            }
            else{
                System.out.println("Input is not in proper format");
                flag=1;
                break;
            }
            indx++;
        }
        if(flag==0){
            System.out.println(s+" in decimal is "+n);
        }
    }
}
