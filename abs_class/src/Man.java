abstract class Parent{
    abstract void display1();
    
    void display2(){
        System.out.println("Testing for abstract class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("this body is provided by the child class method");
    }
    void display3(){
        System.out.println("child");
    }
}
public class Man {
    public static void main(String a[]){
        Child t = new Child();
        t.display1();
        t.display2();
        t.display3();
        
    }
    
}
