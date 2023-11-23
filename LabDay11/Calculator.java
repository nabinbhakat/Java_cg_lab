public class Calculator <T>{
    T v1;
    T v2;
    Calculator(T v1,T v2){
        this.v1=v1;
        this.v2=v2;
    }
    T add(){
        if(v1 instanceof Integer){
            return (T) Integer.valueOf((Integer)v1+(Integer)v2); 
        }
        else if(v1 instanceof Double){
            return (T) Double.valueOf((Double)v1+(Double)v2);
        }
        else{
            throw new UnsupportedOperationException("Unsupported type for Addition");
        }
    }
    T subtract(){
        if(v1 instanceof Integer){
            return (T) Integer.valueOf((Integer)v2-(Integer)v1); 
        }
        else if(v1 instanceof Double){
            return (T) Double.valueOf((Double)v1-(Double)v2);
        }
        else{
            throw new UnsupportedOperationException("Unsupported type for Subtraction");
        }
    }
    T multiply(){
        if(v1 instanceof Integer){
            return (T) Integer.valueOf((Integer)v1*(Integer)v2); 
        }
        else if(v1 instanceof Double){
            return (T) Double.valueOf((Double)v1*(Double)v2);
        }
        else{
            throw new UnsupportedOperationException("Unsupported type for Multiplication");
        }
    }
    T divide(){
        if(v1 instanceof Integer){
            return (T) Integer.valueOf((Integer)v2/(Integer)v1); 
        }
        else if(v1 instanceof Double){
            return (T) Double.valueOf((Double)v1/(Double)v2);
        }
        else{
            throw new UnsupportedOperationException("Unsupported type for Division");
        }
    }
    T mod(){
         if(v1 instanceof Integer){
            return (T) Integer.valueOf((Integer)v2/(Integer)v1); 
        }
         else{
            throw new UnsupportedOperationException("Unsupported type for Modulus");
        }
    }
    
}