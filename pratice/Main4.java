import inst.nitjsr.hospitals.dblayer.DBEntity;
import p1.Doctor;
import p1.Patient;
import p1.Staff;
public class Main4 {
    public static void main(String[] args) {
        Doctor d=(Doctor)DBEntity.getEntity("Doctor");
        d.SetName("A"); d.SetId("D101"); d.SetChamber("3rd"); 
        d.SetSpecilization("ortho");
        d.insert(d);
        d.delete(0);
        d.update(d, 0);
        Staff s=(Staff)DBEntity.getEntity("Staff");
        s.SetName("J");s.SetId("S21");
        s.insert(s);
        s.delete(0);
        s.update(s, 0);
        Patient p=(Patient)DBEntity.getEntity("Patient");
        p.SetName("M"); p.SetId("P344");
        p.insert(p);
        p.delete(0);
        p.update(p, 0);
        p.alter();
    }
}
