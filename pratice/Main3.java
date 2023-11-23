public class Main3 {
    public static void main(String[] args) {
        Parent objChild= Parent.factory("Child1");
        objChild.proc1();
        // objChild.proc1();// calls method of child class as the object is of child type
        
    }
}
