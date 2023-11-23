public class Main {
    public static void main(String[] args) {
        Employee emp0 = new Developer("Shivam", "A102", "Google Inc.");
        Employee emp1 = new Manager("Anubroto", "A111", "Google Inc.");

        System.out.println(emp0.name);
        System.out.println(emp0.id);
        System.out.println(emp0.office);
        System.out.println(emp0.designation);
        System.out.println();
        System.out.println(emp1.name);
        System.out.println(emp1.id);
        System.out.println(emp1.office);
        System.out.println(emp1.designation);
    }
}