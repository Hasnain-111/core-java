interface A1{
    void disp();
}

public class Mian {
    public static void main(String args[]){
     A1 ob = new A1(){
         public void disp(){
             System.out.println("this is the implementation");
         }
     };
     ob.disp();
        
    }
    
}
