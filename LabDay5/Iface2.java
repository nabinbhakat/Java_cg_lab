public interface Iface2 {
    public void im1();
    public void im2();
    default void dm1()
    {
        System.out.println("Default method of interface2");
    }
}
