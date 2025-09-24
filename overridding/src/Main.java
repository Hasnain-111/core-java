class A{
    int  a =10;
}
class B extends A{
    int a =20;
    void disp(){
        System.out.println("this is overridden:"+a);
        System.out.println(super.a);
    }
}
public class Main {
    public static void main(String args[]){
        B ob = new B();
        ob.disp();
    }
    
}
