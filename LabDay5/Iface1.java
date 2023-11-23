
public interface Iface1
{
    public void im1();
    private void priv()
    {
        System.out.println("this is user define private method");
    }
    default void dm1()
    {
        System.out.println("this is a default method in Iface1");
    }
    public static Iface1 createConcrete() {
        return new concrete();
    }
    public static Iface1 createConcrete2() {
        return new concrete2();
    }
}