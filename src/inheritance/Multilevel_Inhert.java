package inheritance;

class One
{
    public void print_geek1()
    {
        System.out.println("Geeks");
    }
}

class Two extends One
{


    public void print_for()
    {

        System.out.println("for");
    }
}

class Three extends Two
{

//    public void print_for()
//    {
//
//        System.out.println("for");
//    }
    public void print_geek()
    {
        super.print_geek1();
        System.out.println("Geeks1");
    }
}

// Drived class
public class Multilevel_Inhert
{
public static void main(String[] args)
{
    Three g = new Three();
    g.print_geek();
    g.print_for();
    g.print_geek();
    Two t = new Two();
    t.print_geek1();
}
}
