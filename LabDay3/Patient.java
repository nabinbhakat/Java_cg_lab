import inst.nitjsr.hospitals.dblayer.*;
public class Patient implements DBEntity{
    int id;
    String name;
    public void insert(DBEntity obj){
        System.out.println("Patient with id "+this.id+" inserted");
    }
    public void delete(int n){
        System.out.println("Patient with id "+this.id+" deleted");
    }
    public void update(DBEntity obj,int n){
        System.out.println("Patient with id "+this.id+" updated");
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
}
