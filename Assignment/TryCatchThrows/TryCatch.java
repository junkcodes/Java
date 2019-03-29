package TryCatchThrows;

class TryCatch {
    private String name;
    TryCatch(String name) {
        this.name = name;
    }
    void run() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(name);
    }
}
