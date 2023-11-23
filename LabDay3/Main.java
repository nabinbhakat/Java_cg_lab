public class Main {
    public static void main(String[] args) {
        Doctor d=new Doctor();
        d.setId(101);
        d.setName("Okhilesh");
        d.setSpecilization("dentist");
        d.setChamber("2nd floor");
        d.insert(d);
        Patient p =new Patient();
        p.setId(100);
        p.setName("nabin");
        p.insert(p);
        Staff s= new Staff();
        s.setId(1001);
        s.setName("Lalu");
        s.insert(s);
    }
}
