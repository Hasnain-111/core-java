class Thread1 implements Runnable{
   public void run(){
       for(int i =0;i<10;i++){
           System.out.println("Thread1' s i=" +i);
       }
   }^
}
public class Main {
    public static void main(String args[]){
        Thread1 ob = new Thread1();
        Thread t = new Thread(ob);//step 2
        t.start();
        for(int i =0;i<10;i++){
            System.out.println("Thread's main i=" +i);
        }
    }
    
}
