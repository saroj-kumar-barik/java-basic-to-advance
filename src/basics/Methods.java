package basics;

public class Methods {

    public static void rite(){
        System.out.println("My name is Ritz");

    }
    public static void main(String[] args) {
        rite();
        MyMethod obj = new MyMethod();
        obj.meth();
    }
}

class MyMethod{
    public void meth(){
        System.out.println("Hello");
    }
}
