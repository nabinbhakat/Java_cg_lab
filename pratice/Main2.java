public class Main2 {
    public static void main(String[] args) {
        // Employee e=new Employee("Nabin","E101","Jamshedpur","Desk");
        Developer d=new Developer("Nikhil", "E102", "Jaipur");
        Manager m=new Manager("Zaid","E103","Azamgarh");
        // e.print();
        d.print();
        m.print();
        System.out.println("Count= "+Employee.count);
        d.getEmployee("Developer");
        d.print();
        System.out.println("Count= "+Employee.count);
    }
}
