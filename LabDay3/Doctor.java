import inst.nitjsr.hospitals.dblayer.DBEntity;
public class Doctor implements DBEntity{
    int id;
    String name;
    String speciliazation;
    String chamber_floor;
    public void insert(DBEntity obj){
    
        System.out.println("Doctor with id "+this.id+" inserted");
    }
    public void delete(int n){
        System.out.println("Doctor with id "+this.id+" deleted");
    }
    public void update(DBEntity obj,int n){
        System.out.println("Doctor with id "+this.id+" updated");
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSpecilization(String spec){
        this.speciliazation=spec;
    }
    public void setChamber(String floor){
        this.chamber_floor=floor;
    }

}
