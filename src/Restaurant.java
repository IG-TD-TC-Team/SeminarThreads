// Launch multiple times -> not always same result
// Breakpoint on Restaurant.platesPrepared++; > Suspend
public class Restaurant {

    static int platesPrepared = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread waiter1 = new Thread(new Waiter());
        Thread waiter2 = new Thread(new Waiter());

        waiter1.start();
        waiter2.start();

        waiter1.join();
        waiter2.join();

        System.out.println("Plates prepared: " + platesPrepared);
    }
}