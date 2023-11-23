package p1;
import inst.nitjsr.hospitals.dblayer.DBEntity;

public class Doctor implements DBEntity{
    String Name;
    String Id;
    String SPecilization;
    String ChamberFloor;
    public void SetName(String Name){
        this.Name=Name;
    }
    public void SetId(String Id){
        this.Id=Id;
    }
    public void SetSpecilization(String SPecilization){
        this.SPecilization=SPecilization;
    }
    public void SetChamber(String ChamberFloor){
        this.ChamberFloor=ChamberFloor;
    }
    public void insert(DBEntity db){
        Doctor d=(Doctor)db;
        System.out.println("Inserting doctor with ID: "+d.Id);
    }
    public void delete(int x){
        System.out.println("Deleting doctor with ID: "+this.Id);
    }
    public void update(DBEntity db,int x){
        Doctor d=(Doctor)db;
        System.out.println("Updating doctor with ID: "+d.Id);
    }
}
