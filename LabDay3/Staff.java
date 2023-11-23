import inst.nitjsr.hospitals.dblayer.DBEntity;
public class Staff implements DBEntity{
    int id;
    String name;
    public void insert(DBEntity obj){
        System.out.println("Staff with id "+this.id+" inserted");
    }
    public void delete(int n){
        System.out.println("Staff with id "+this.id+" deleted");
    }
    public void update(DBEntity obj,int n){
        System.out.println("Staff with id "+this.id+" updated");
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
}
