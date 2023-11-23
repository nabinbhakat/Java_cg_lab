package inst.nitjsr.hospitals.dbplayer;

public class staff implements DBEntity {
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
        staff a = (staff)entity;
        System.out.println("from insert method to staff class");
    }
    
    public void delete(int id){
        System.out.println("from delete method to staff class");
    }
    
    public void update(int id,DBEntity entity){
        staff a= (staff)entity;
        System.out.println("the updated value of the current id ");
    }

}
