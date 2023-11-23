public class Practice {
    {
        System.out.println("instance initializer block");
    }
    static{
        System.out.println("static initializer block");
    }
    public static void main(String[] args) {
        Practice p=new Practice();
    }
}
