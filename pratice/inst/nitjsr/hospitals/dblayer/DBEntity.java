package inst.nitjsr.hospitals.dblayer;
import p1.Doctor;
import p1.Patient;
import p1.Staff;
public interface DBEntity{
    void insert(DBEntity db);
    void delete(int x);
    void update(DBEntity db,int x);
    public static DBEntity getEntity(String name){
        if(name.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }
        else if(name.equalsIgnoreCase("Staff")){
            return new Staff();
        }
        else if(name.equalsIgnoreCase("Patient")){
            return new Patient();
        }
        else{
            return null;
        }
    }
    default void alter(){
        System.out.println("Implementaion in progree");
    }
}