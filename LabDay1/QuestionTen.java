public class QuestionTen {
    public static void main(String[] args) {
        double a,b,c;
        a=Double.parseDouble(args[0]);
        b=Double.parseDouble(args[1]);
        c=Double.parseDouble(args[2]);
        double d;
        d=Math.pow(b,2)-4*a*c;
        if(d==0){
            double x= -b/(2*a);
            System.out.println("Roots are equal i.e "+x);
        }
        else if(d>0){
            double x1= (-b+Math.sqrt(d))/(2*a);
            double x2= (-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots are "+x1+" and "+x2);
        }
        else{
            d=-d;
            double x=-b/(2*a),xi=Math.sqrt(d)/(2*a);
            System.out.println("Roots are "+x+"+"+xi+"i and "+x+"-"+xi+"i");
        }
    }
}
