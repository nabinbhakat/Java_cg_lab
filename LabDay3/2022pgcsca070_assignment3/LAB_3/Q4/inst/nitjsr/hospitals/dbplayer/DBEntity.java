package inst.nitjsr.hospitals.dbplayer;

public interface DBEntity {
    void insert(DBEntity entity);
    void delete(int id);
    void update(int id,DBEntity entity);

    static DBEntity getentity(String prof){
        if(prof=="doctor") return new doctor();
        else if(prof=="staff") return new staff();
        else if(prof=="patient") return new patient();
        else throw  new IllegalArgumentException("Invalid input ");
    }

    default void alter() {
        System.out.println("Implementation in progress");
    }

}
