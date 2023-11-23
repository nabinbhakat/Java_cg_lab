public class Main {
    public static void main(String[] args) {

        double[] arr = new double[] {1, 2, 4, 5, 6, 7};
        Vector v = new Vector(arr);

        System.out.println(v.get(5));

        v.set(5, 100.56);

        System.out.println(v.get(5));
    }

}