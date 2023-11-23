package inst.nitjsr.hospitals.dbplayer;

public class patient implements DBEntity {
    
    public void insert(DBEntity entity){

        System.out.println("Inserting patient with idinto the database");
    }
    
    public void delete(int id){
        System.out.println("Deleting paient idfrom the database");
    }
    
    public void update(int id,DBEntity entity){

        System.out.println("updating the paient id into the databse");
    }
}
