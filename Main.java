package MultiThreading;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,6,2,3,2,7,2,7,2,7};
        int[] brr = new int[]{4,3,5,3,6,4,1,5,1,1};
        int[] crr = new int[]{8,4,23,6,2,6,4,7,1};
        int[] drr = new int[]{2,35,5,2,2,6,7,31,7};

        Threading firstone = new Threading(arr, brr, "First");
        Threading secondone = new Threading(crr, drr, "Second");

        Thread firstThread = new Thread(firstone);
        Thread secondThread = new Thread(secondone);

        firstThread.start();
        secondThread.start();

        while (firstThread.isAlive() || secondThread.isAlive());

        for (int i = 0; i < 10; i++) 
        {
            try
            {
            System.out.println(firstone.out[i]+secondone.out[i]);
            } catch (Exception error) 
            {
             error.printStackTrace();
            }

        }
    }
}
