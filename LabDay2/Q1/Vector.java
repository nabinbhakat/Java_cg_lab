public class Vector {
    double[] vec;

    public Vector(double[] arr) {
        vec = arr;
    }
    public Vector(Vector v1) {
        vec = v1.vec;
    }

    void set(int index, double value) {
        vec[index] = value;
    }

    double get(int index) {
        return vec[index];
    }

}
