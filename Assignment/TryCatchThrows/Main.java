package TryCatchThrows;

public class Main {
    public static void main(String[] args) {
        TryCatch t = new TryCatch("TesT");
        try {
            t.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("! failed !");
        }
    }
}
