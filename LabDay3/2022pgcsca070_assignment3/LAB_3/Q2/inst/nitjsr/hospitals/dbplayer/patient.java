package inst.nitjsr.hospitals.dbplayer;

public class patient implements DBEntity {
    int id;
    String name;
    String specilization;
    int chamber_floor;

    public void setter(int id, String name, String speci, int floor){
            this.id = id;
            this.name=name;
            this.specilization=speci;
            this.chamber_floor=floor;
    };
    
    public void insert(DBEntity entity){
        patient a  = (patient)entity;
        System.out.println("Inserting patient with id "+a.id+" into the database");
    }
    
    public void delete(int id){
        System.out.println("Deleting patient with id "+id+" from the database");
    }
    
    public void update(int id,DBEntity entity){
        System.out.println("updating the paient "+id+" into the databse");
    }
}
