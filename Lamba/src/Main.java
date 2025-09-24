interface A2{
    void disp();
}
public class Main {
    public static void main(String args[]){
        A2 ob =()->{  //this is the lambda expression 
            System.out.println("this is the expression using lambda expression");    
        };
        ob.disp();
    }
    
}
