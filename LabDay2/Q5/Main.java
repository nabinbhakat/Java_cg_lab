public class Main {
    public static void main(String[] args) {
        Employee emp0 = new Developer("Shivam", "A102", "Google Inc.");
        emp0.insert();
        Employee emp1 = new Manager("Anubroto", "A111", "Google Inc.");
        emp1.insert();
        Employee emp2 = new Developer("Anubhav","A103", "NVIDIA Inc." );
        emp2.insert();

        System.out.println("Total Number of Employee = " +  Employee.getEmployeeCount());
    }
}