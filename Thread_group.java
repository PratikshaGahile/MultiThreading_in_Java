
class ChildThreadGrop extends Thread{

    ChildThreadGrop(ThreadGroup tg,String str){
        super(tg,str);
    }
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
public class Thread_group{
    public static void main(String[] args) {
        //create ttehobject of threadGroup

        ThreadGroup pthread =new ThreadGroup("Core2Web");
        ChildThreadGrop obj=new ChildThreadGrop(pthread,"Anyname");
        obj.start();
        //create the another threadgroup which is teh child of the pthread

        ThreadGroup chiThread= new ThreadGroup(pthread,"Incubator");
        ChildThreadGrop obj2 = new ChildThreadGrop(chiThread,"flutter");
        obj2.start();


    }
}
