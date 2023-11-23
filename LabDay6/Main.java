public class Main {
    public static void main(String[] args) {
        thread t= new thread();
        t.start();
        for(int i=0;i<=5;i++){
            System.out.println("Main thread: "+i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
                e.getMessage();
            }
        }
        
    }
}
