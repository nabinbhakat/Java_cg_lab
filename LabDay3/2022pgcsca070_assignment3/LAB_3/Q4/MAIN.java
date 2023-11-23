import inst.nitjsr.hospitals.dbplayer.*;

public class MAIN {
    public static void main(String[] args){
        DBEntity p = new doctor();
        DBEntity q = new patient();
        DBEntity r = new staff();
        p.insert(null);
        p.delete(1);
        p.update(0);

        q.insert(null);
        q.delete(1);
        q.update(0, null);

        r.insert(null);
        r.delete(1);
        r.update(0, null);

        doctor a =  (doctor)DBEntity.getentity("doctor"); 
        a.setter(01,"Ayush","cardeologist",02);
        patient b = (patient)DBEntity.getentity("patient");
        b.setter(01,"satyam","fever",03);
        staff c = (staff)DBEntity.getentity("staff"); 
        c.setter(01, "belal", "nurse", 4);
        a.alter();
        
        
    }
}
