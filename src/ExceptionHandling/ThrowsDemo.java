package ExceptionHandling;

import java.io.IOException;


public  class  ThrowsDemo  {

    // ************Program showing Throws dose not handle the exception *************//
    // We are getting error at Compile time .
    // Throws keyword is used to declare the exception .

    void m() throws IOException {
        System.out.println("hi");
        throw new IOException("Device ");
    }
    void n() throws IOException {
        System.out.println("hi");
        m();
        throw new ArithmeticException();
    }
    void p() throws IOException{
        n();
    }
    public static void main(String args[]) throws IOException {
        ThrowsDemo obj=new ThrowsDemo();
        obj.p();
        System.out.println("normal flow...");
    }

    // ************Program showing Throws handling the Exception *************//
    // We are handling the exception .
//        void m() throws IOException {
//            System.out.println("hi");
//            throw new IOException("Device ");
//        }
//        void n() throws IOException {
//            System.out.println("hi");
//            m();
//        }
//        void p() {
//            try {
//                n();
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }
//        public static void main(String args[]) {
//            ThrowsDemo obj=new ThrowsDemo();
//            obj.p();
//            System.out.println("normal flow...");
//        }
}
