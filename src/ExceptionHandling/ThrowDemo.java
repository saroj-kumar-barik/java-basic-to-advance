package ExceptionHandling;


public class ThrowDemo {
    //****************** part 1  of the program***********************//

//    static void validate(int age){
//
//        if(age<18) {
//            System.out.println("good");
////            int a  = 19/0;
//        }
//        else
//            System.out.println("welcome to vote");
//    }
//    public static void main(String args[]){
//
//        validate(13);
//        try {
//            throw new ArithmeticException();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        System.out.println("rest of the code...");
//    }


    //****************** part 2  of the program***********************//

        void m(){
//            throw new java.io.IOException("device error");   //checked exception not propagate
            throw new ArithmeticException("Got Arithmetic Exception "); // It will propagate
        }
        void n(){
            System.out.println("Hi");
            m();
        }
        void p() {

            try{
                n();
            } catch(Exception e) {System.out.println(e);}
        }
        public static void main(String args[]) {
            ThrowDemo obj = new ThrowDemo();
            obj.p();
            System.out.println("normal flow");
        }
    }


