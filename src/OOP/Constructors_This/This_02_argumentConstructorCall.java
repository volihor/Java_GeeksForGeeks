package OOP.Constructors_This;
/** 6. Using ‘this’ keyword as an argument in the constructor call *
 *
 * https://www.geeksforgeeks.org/this-reference-in-java/
 * */

public class This_02_argumentConstructorCall {
    class A{
        B refO;
        A(B ref){
            this.refO = ref;
            refO.displayB();

            ref.b = 88;
            ref.displayB();
        }
    }

    class B{
         int b = 8;
            // Default Constructor that create a object of A
            // with passing this as an argument in the
            // constructor
        B(){
            System.out.println("B class default constructor");
   /** 6. Using ‘this’ keyword as an argument in the constructor
    *     call */
             /*A ref = */new A(this);
        }
        void displayB(){
            System.out.println("B class, it b = " + b);
        }
    }

    public static void main(String[] args) {
        This_02_argumentConstructorCall.B refB = new This_02_argumentConstructorCall().new B();
    }
}
