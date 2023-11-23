public class Manager extends Employee{
    Manager() {
        super("NULL", "NULL", "NULL", "Manager");
    }
    public Manager(String name,String id,String office){
        super(name, id, office,"Manager");
    }
    void insert(){
        System.out.println("Data inserted in Manager Class");
    }
    void delete(){
        System.out.println("Data deleted in Manager Class");
    }
}
