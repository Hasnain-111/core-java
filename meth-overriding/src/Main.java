class Parent{
    int a =15,b =30;
    void display(){
        int c =a+b;
        System.out.println("the sum is " +c);
    }
}
class Child extends Parent{
    void display(){
        super.display();
        int d =a*b;
        System.out.println("the product is :" +d);
    }
}
public class Main {
    public static void main(String args[]){
        Child ob = new Child();
        ob.display();
    }
    
}
