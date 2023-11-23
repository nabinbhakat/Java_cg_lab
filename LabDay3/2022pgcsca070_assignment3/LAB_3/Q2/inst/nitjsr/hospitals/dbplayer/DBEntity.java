package inst.nitjsr.hospitals.dbplayer;

public interface DBEntity {
    void insert(DBEntity entity);
    void delete(int id);
    void update(int id,DBEntity entity);

}
