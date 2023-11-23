public class Manager extends Employee {


    Manager() {
        super("NULL", "NULL", "NULL", "Manager");
    }
    Manager(String name, String id, String office) {
        super(name, id, office, "Manager");
    }
    void insert() {
        System.out.println("Data inserted in Manager Database");
    }
    void delete() {
        System.out.println("Data deleted from Manager Database");
    }
}
