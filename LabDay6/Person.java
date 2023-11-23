public class Person {
    private String name;
    private int age;

    public Person(String name,int age) throws IllegalArgumentException{
        this.name=name;
        try{
            if(age<=1)
                throw new InvalidEntryException("Age is less than 1");
            else{
                this.age=age;
            }
        }
        catch(InvalidEntryException e){
            IllegalArgumentException ae=new IllegalArgumentException("Invalid age provided");
            ae.initCause(e);
            throw ae;
        }
        finally{
            System.out.println("Person Object Created");
        }
    }
    public void getName(){
        System.out.println("Name= "+this.name);
    }
    public void getAge(){
        System.out.println("Age= "+this.age);
    }
}
