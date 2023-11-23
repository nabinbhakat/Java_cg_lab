package inst.nitjsr.hospitals.dbplayer;

public class doctor implements DBEntity {

    
    public void insert(DBEntity entity){
        doctor a = (doctor)entity;
        System.out.println("from insert method to doctor class");
    }
    
    public void delete(int id){
        System.out.println("from delete method to doctor class");
    }
    
    public void update(int id,DBEntity entity){
        doctor a= (doctor)entity;
        System.out.println("the updated value of the current id ");
    }

    

}
