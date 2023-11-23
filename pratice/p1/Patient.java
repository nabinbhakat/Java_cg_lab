package p1;
import inst.nitjsr.hospitals.dblayer.DBEntity;
public class Patient implements DBEntity{
    String Name;
    String Id;
    public void SetName(String Name){
        this.Name=Name;
    }
    public void SetId(String Id){
        this.Id=Id;
    }
    public void insert(DBEntity db){
        Patient p=(Patient)db;
        System.out.println("Inserting patient with ID: "+p.Id);
    }
    public void delete(int x){
        System.out.println("Deleting patient with ID: "+this.Id);
    }
    public void update(DBEntity db,int x){
        Patient p=(Patient)db;
        System.out.println("Updating patient with ID: "+p.Id);
    }
}
