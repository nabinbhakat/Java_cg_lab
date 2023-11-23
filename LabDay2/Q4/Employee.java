public abstract class Employee {
    String name, id, office, designation;

    public Employee() {
        this.name = "NULL";
        this.id = "NULL";
        this.office = "NULL";
        this.designation = "NULL";
    }
    public Employee(String name, String id, String office, String designation) {
        this.name = name;
        this.id = id;
        this.office = office;
        this.designation = designation;
    }
    //factory method
    static Employee getEmployee (String name) {
        switch (name) {
            case "Developer" :
                return new Developer();
            case "Manager" :
                return new Manager();
            default :
                System.out.println("Invalid TypeName");
                return null;
        }
    }

    abstract void insert();
    abstract void delete();

}
