package polymerphism;

class A
    {
        void m1()
        {
            System.out.println("Inside polymerphism.A's m1 method");
        }
    }

class B extends A
{
    void m1()
    {
        System.out.println("Inside polymerphism.B's m1 method");
    }
}
    class C extends A
    {
        void m1()
        {
            System.out.println("Inside polymerphism.C's m1 method");
        }
    }

    class DynamicMethodDispatch
    {
        public static void main(String args[])
        {
            A a = new A();
            B b = new B();
            C c = new C();
            A d = new C();
            System.out.println(d.getClass());
            d.m1();
            A ref;
//            polymerphism.B ref;
            ref = a;
            a.m1();
            ref = b;
            b.m1();
            ref = c;
            c.m1();
        }
    }

    // Java program to illustrate the fact that
// runtime polymorphism cannot be achieved
// by data members

//    class polymerphism.A
//    {
//        int x = 10;
//    }
//
//    class polymerphism.B extends polymerphism.A
//    {
//        int x = 20;
//    }
//    public class polymerphism.DynamicMethodDispatch
//    {
//        public static void main(String args[])
//        {
//            polymerphism.A a = new polymerphism.B();
//            System.out.println(a.x);
//        }
//    }

