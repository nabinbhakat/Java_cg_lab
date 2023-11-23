public class Parent {
    // Parent(){
    //     System.out.println("Parent Class Constructor");
    // }
    static{
        System.out.println("Static constructor of Parent class");
    }
    Parent(int x){
        System.out.println("Parent Class Constructor");
    }
    // static public Parent(){

    // }
    public void proc1(){
        System.out.println("proc1 method of Parent Class");
    }
    static Parent factory(String name){
        if(name.equalsIgnoreCase("Child")){
            return new Child();
        }
        else if(name.equalsIgnoreCase("Child1")){
            return new Child1();
        }
        else{
            return null;
        }
    } 
}
