package inst.nitjsr.hospitals.dblayer;
public interface DBEntity{
    void insert(DBEntity obj);
    void delete(int n);
    void update(DBEntity obj,int n);
}