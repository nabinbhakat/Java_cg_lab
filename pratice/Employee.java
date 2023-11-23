abstract public class Employee {
    String name;
    String id;
    String office;
    String designation;
    static int count=0;
    public Employee(){
        name=null;
        id=null;
        office=null;
        designation=null;
        count++;
    }
    public Employee(String name,String id,String office,String designation){
        this.name=name;
        this.id=id;
        this.office=office;
        this.designation=designation;
        count++;
    }
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Office: "+office);
        System.out.println("Designation: "+designation);
    }
    abstract void insert();
    abstract void delete();

    Employee getEmployee(String name){
        switch(name){
            case "Developer":
                return new Developer();
            case "Manager":
                return new Manager();
            default:
                return null;
        }
    }
}