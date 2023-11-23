package inst.nitjsr.hospitals.dbplayer;

public abstract class DBEntity {
    public abstract void insert(DBEntity entity);
    public abstract void delete(int id);
    public abstract void update(int id,DBEntity entity);

    public static DBEntity getentity(String prof){
        if(prof=="doctor") return new doctor();
        else if(prof=="staff") return new staff();
        else if(prof=="patient") return new patient();
        else throw  new IllegalArgumentException("Invalid input ");
    }

    public void alter() {
        System.out.println("Implementation in progress");
    }

}
