public class Prog1_oddeventhread{
    public static void main(String[] args)
    {
        String s= args[0];
        Runnable r= new oddthread(s);
        Thread t=new Thread(r);
        Runnable r2=new eventhread(s);
        Thread t2=new Thread(r2);
        t.start();
        t2.start();
        try{
            t.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("End of Main Thread:Both threads completed");
    }
}
class oddthread implements Runnable
{
    int n;
    oddthread(String s)
    {
        n=Integer.parseInt(s);
    }
    public void run(){
        for(int i=0;i<n;i++) {
            try{
                if(i%2==1)
                {
                    System.out.println("odd"+i);
                    Thread.sleep(300);
                }
            }catch(InterruptedException e) { }
        }
    }
}
class eventhread implements Runnable
{
    int n;
    eventhread(String s)
    {
        n=Integer.parseInt(s);
    }
    public void run(){
        for(int i=0;i<n;i++) {
            try{
                if(i%2==0)
                {
                    System.out.println("even"+i);
                    Thread.sleep(300);
                }
            }catch(InterruptedException e) { }
        }
    }
}