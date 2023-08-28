
class Mythread3 implements  Runnable{
    public void run(){
        System.out.println("Mythread3 : "+Thread.currentThread().getName());
        System.out.println("in mythread ");

        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
    }


}
public class Thread_using_Runnable_Interface {
    public static void main(String[] args) {
        //runnable interface does not have any method other than the run
        //runnable does not have the start method
        Mythread3 obj = new Mythread3();
        Thread t = new Thread (obj);

        t.start();
        // t.start() --->we can start the one thread at only one time

        System.out.println(" Main: "+ Thread.currentThread().getName());
        System.out.println(t.getPriority());
    }
}
