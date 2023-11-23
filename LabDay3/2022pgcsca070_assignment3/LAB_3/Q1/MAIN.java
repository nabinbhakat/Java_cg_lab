import inst.nitjsr.hospitals.dbplayer.*;

public class MAIN {
    public static void main(String[] args){
        DBEntity p = new doctor();
        DBEntity q = new patient();
        DBEntity r = new staff();
        p.insert(null);
        p.delete(1);
        p.update(0, null);

        q.insert(null);
        q.delete(1);
        q.update(0, null);

        r.insert(null);
        r.delete(1);
        r.update(0, null);

        
        
    }
}
