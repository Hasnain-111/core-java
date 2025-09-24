import java.util.*;
public class Main {
    public static void main(String args[]){
        int a,b,sum;
        int avg;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b = sc.nextInt();
        
        try{
            sum = a+b;
            avg = sum/2;
            Thread.sleep(2000);
            System.out.println(sum);
            System.out.println(avg);
            
        }
        catch(InterruptedException e){
            
        }
        
    }
    
}
