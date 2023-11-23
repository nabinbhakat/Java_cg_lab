public class Developer extends Employee {

    Developer() {
        super("NULL", "NULL", "NULL", "Developer");
    }
    Developer(String name, String id, String office) {
        super(name, id, office, "Developer");
    }
    void insert() {
        System.out.println("Data inserted in Developer Database");
    }
    void delete() {
        System.out.println("Data deleted from Developer Database");
    }
}
