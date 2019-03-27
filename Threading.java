package MultiThreading;

public class Threading implements Runnable {

    private int[] arr;
    private int[] brr;

    int[] out = new int[10];

    private String name;

    Threading(int[] arr, int[] brr, String name) {
        this.arr = arr;
        this.brr = brr;
        this.name = name;
    }

    @Override
    public synchronized void run() 
    {
        for (int i = 0; i < 10; i++) 
        {
            out[i] = arr[i] + brr[i];

            try 
            {
                Thread.sleep(100);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
