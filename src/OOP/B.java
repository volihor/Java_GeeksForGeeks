package OOP;
/**
 *    1) CAN'T override static methods !!!
 *    2) TYPE of reference define what STATIC !!! methods
 *       are awaken
**/
class A {
  /*  static *//*void*//* A(){

    }*/
    private static void test1() {
        System.out.println("private static void A.test1");
    }

    static void test2() {
        System.out.println("static void A.test2()");
        test1();   //  will be executed A.test1  !!!!
                   //  because method test1() is static !!!!!
    }
}

public class B extends A {
    void test1() {
        System.out.println("static void B.test1");
    }
    static void test2() { //
        System.out.println("\nstatic void B.test2()");
//        super.test2();   //  Error: non-static variable super cannot be referenced from a static context
//        test1();           // Error: non-static method test1() cannot be referenced from a static context
    }
    public static void main(String[] args) {
        A a = new B();  //TYPE of reference define what STATIC !!! methods
                        //* are awaken
        a.test2();
        B b = new B();
        b.test2();

        Boolean b1 = new Boolean(true);  //  Warning: java: Boolean(boolean) in java.lang.Boolean has been deprecated
        System.out.println(b1);
    }
}

class Test {

    void display()
    {
        // calling fuction show()
        show();
//        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }


    public static void main(String args[]) {
        Test t1 = new Test();
        t1.display();
    }
}
