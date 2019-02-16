package OOP;

public class Tmp_Finalize {
    public static void main(String[] args) {
        System.out.println("Start main.");
        Tmp_Finalize t = new Tmp_Finalize();

        try {
            t.finalize();
            System.out.println("-- after 't.finalize()' --"); // Don't executed !!!
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        t = null;

        System.gc();
        System.out.println("End of main.");
    }

    @Override
    protected void finalize() {
        System.out.println(" ==>> Finalize() method overriden!");
        int i = 1/0; // Rise an exception !!!
    }
}