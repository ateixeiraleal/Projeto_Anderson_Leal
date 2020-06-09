public class Principal {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        System.out.println(a.MA1());
        System.out.println(a.MA2());
        System.out.println(b.MB1());
        System.out.println(b.MB2());
        a.MA3();
        System.out.println(c.MC1());
        System.out.println(c.MC2());
    }
}