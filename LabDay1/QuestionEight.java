import java.util.*;
public class QuestionEight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int map[]=new int[26];
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        int curr=0,idx=0;
        for(int i=0;i<26;i++){
            curr=0;
            for(int j=0;j<26;j++){
                if(map[j]!=0){
                    if(curr<map[j]){
                        curr=map[j];
                        idx=j;
                    }
                }
            }
            if(curr>0){
                System.out.println((char)('a'+idx)+" "+curr);
            }
            map[idx]=0;
        }
        sc.close();
    }
}
