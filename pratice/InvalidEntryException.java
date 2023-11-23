public class InvalidEntryException extends Exception{
    String msg;
    Throwable cause;
    public InvalidEntryException(String msg){
        super(msg);
        this.msg=msg;
        this.cause=null;
    }
    public String getMessage(){
        return msg;
    }
    public String toString(){
        String msg="Invalid Entry Exception "+ this.msg;
        return msg;
    }
}
