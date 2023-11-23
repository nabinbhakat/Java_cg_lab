package inst.nitjsr.hospitals.dbplayer;

public class staff implements DBEntity {
    
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
