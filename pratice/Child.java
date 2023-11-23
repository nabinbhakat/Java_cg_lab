public class Child extends Parent{
    static{
        System.out.println("Static constructor of Child class");
    }
    Child(){
        super(0);
        System.out.println("Child Class constructor");
    }
    // void proc1(){ //cannot reduce the visibilty of inherited methods
    public void proc1(){ 
        System.out.println("Proc1 method of Child Class");
    }
}
