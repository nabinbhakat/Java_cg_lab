public class InvalidEntryException extends RuntimeException{
    private String msg;
    private Throwable cause;
    public InvalidEntryException(String msg){
        super(msg);
        this.msg=msg;
    }

    public InvalidEntryException(String msg,Throwable cause){
        super(msg);
        this.msg=msg;
        this.cause=cause;
        this.initCause(cause);
    }

    public String getMessage(){
        String msg=this.msg;
        return msg;
    }

    public String toString(){
        String msg = "InavlidEntryException "+this.msg;
        return msg;
    }
}
