package inst.nitjsr.hospitals.dbplayer;

public class doctor implements DBEntity {
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
        doctor a = (doctor)entity;
        System.out.println("Inserting doctor with id "+a.id+" into the database");
    }
    
    public void delete(int id){
        System.out.println("Deleting doctor with id "+id+" from the database");
    }
    
    public void update(int id){
        System.out.println("updating doctor with id "+id+" into the database");
    }

    

}
