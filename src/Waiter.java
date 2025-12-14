public class Waiter implements Runnable {

    public void run() {
        for (int i = 0; i < 100000; i++) {
            preparePlate();
        }
    }

    private void preparePlate() {
        Restaurant.platesPrepared++;
    }
}