package p1;
import inst.nitjsr.hospitals.dblayer.DBEntity;
public class Staff implements DBEntity{
    String Name;
    String Id;
    public void SetName(String Name){
        this.Name=Name;
    }
    public void SetId(String Id){
        this.Id=Id;
    }
    public void insert(DBEntity db){
        Staff s=(Staff)db;
        System.out.println("Inserting Staff with ID: "+s.Id);
    }
    public void delete(int x){
        System.out.println("Updating Staff with ID: "+this.Id);
    }
    public void update(DBEntity db,int x){
        Staff s=(Staff)db;
        System.out.println("Updating Staff with ID: "+s.Id);
    }
}
