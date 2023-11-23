public class MainPratice {
    public static void main(String[] args) {
        try{
            throw new InvalidEntryException("Invalid Entry");
        }
        catch(InvalidEntryException e){
            System.out.println(e.toString());
        }
    }
}
