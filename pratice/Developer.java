public class Developer extends Employee{
    Developer() {
        super("NULL", "NULL", "NULL", "Developer");
    }
    public Developer(String name,String id,String Office){
        super(name, id, Office,"Developer");
    }
    void insert(){
        System.out.println("Data inserted in Developer Class");
    }
    void delete(){
        System.out.println("Data deleted in Developer Class");
    }
}
