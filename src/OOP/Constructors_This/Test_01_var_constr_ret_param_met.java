package OOP.Constructors_This;
/**
 * 1. Using ‘this’ keyword to refer current class instance variables
 * 2. Using this() to invoke current class constructor
 * 3. Using ‘this’ keyword to return the current class instance
 * 4. Using ‘this’ keyword as method parameter
 * 5. Using ‘this’ keyword to invoke current class method
 * 6. Using ‘this’ keyword as an argument in the constructor call
 *
 *
* */
class Test_01_var_constr_ret_param_met {
    int a;
    int b;
    //Default constructor
    Test_01_var_constr_ret_param_met()   {
/**  2. Using this() to invoke current class constructor*/
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
    Test_01_var_constr_ret_param_met(int a, int b)    {
/**  1. Using ‘this’ keyword to refer current class instance variables*/
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    //Method that returns current class instance
    Test_01_var_constr_ret_param_met get()    {
/**  3. Using ‘this’ keyword to return the current class instance*/
        return this;
    }

/**   4. Using ‘this’ keyword as method parameter*/
// Method that returns current class instance
    void getDp()    {
        display(this);
    }
    //Displaying value of variables a and b
    void display()    {
        System.out.println("a = " + a + "  b = " + b);
    }
    //  (* 4.) Method that receives 'this' keyword as parameter
    void display(Test_01_var_constr_ret_param_met obj)    {
        System.out.println("a = " + a + "  b = " + b);
    }

/**   5. Using ‘this’ keyword to invoke current class method*/
    void display_2()    {
        // calling fuction show()
        this.show();
        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }
    public static void main(String[] args)    {
        Test_01_var_constr_ret_param_met object = new Test_01_var_constr_ret_param_met();
        object.display();
        object.get().display(); //   * 3. Using ‘this’ keyword to return the current class instance
        object.getDp(); // * 4. Using ‘this’ keyword as method parameter
        object.display_2();  // * 5. Using ‘this’ keyword to invoke current class method*/
    }
}