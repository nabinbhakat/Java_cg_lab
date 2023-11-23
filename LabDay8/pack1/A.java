package pack1;
public class A {
    private int p;
    protected int q;
    public int r;
    int s;
    public A(){
        p=1;
        q=2;
        r=3;
        s=4;
    }
    public class B{
        private int k;
        protected int l;
        public int m;
        int n;
        public B(){
            k+=p;
            l+=q;
            m+=r;
            n+=s;
        }
        public void displayB(){
            System.out.println("Display in B");
            System.out.println("k= "+k);
            System.out.println("l= "+l);
            System.out.println("m= "+m);
            System.out.println("n= "+n);
        }
    }
    B objB=new B();
    public void displayA(){
            System.out.println("Display in A");
            System.out.println("p= "+p);
            System.out.println("q= "+q);
            System.out.println("r= "+r);
            System.out.println("s= "+s);
            System.out.println("B.k= "+objB.k);
            System.out.println("B.l= "+objB.l);
            System.out.println("B.m= "+objB.m);
            System.out.println("B.n= "+objB.n);
        }

}
