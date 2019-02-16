package OOP;

// A Java program to demonstrate that non-method
// members are accessed according to reference
// type (Unlike methods which are accessed according
// to the referred object)

class Parent{
    int value = 1000;
    void mthd(){
        System.out.println("Parent method.");
    }
}

class Child extends Parent{
    int value = 10;
    void mthd(){
        System.out.println("Child method.");
    }
}

// Driver class
public class Inheritance_Variales_Methods
{
    public static void main(String[] args)
    {
        Parent cobj = new Child();
        Parent par = cobj;

        System.out.println(cobj.value);
        cobj.mthd();

        System.out.println("\n cobj.value - " + cobj.value);
        System.out.println(" par.value - " + par.value);
        System.out.println("((Child)cobj).value - " + ((Child)cobj).value);
        System.out.println("((Child)par)).value - " + ((Child)par).value  +"\n");

        System.out.print(" par.mthd() ==>> ");
        par.mthd();
        System.out.print(" ((Parent)cobj).mthd() ==>> ");
        ((Parent)cobj).mthd();

        par = new Parent();
        System.out.print(" par = new Parent() ==>> ");
        par.mthd();
        // Using instanceof to make sure that par
        // is a valid reference before typecasting
       /* if (par instanceof Child)
        {
            System.out.println("Value accessed through " +
                    "parent reference with typecasting is " +
                    ((Child)par).value);
        }*/
    }
}