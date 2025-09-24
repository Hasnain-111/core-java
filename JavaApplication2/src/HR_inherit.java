class A{
    int a =10,b =15,c =20;
}
class B extends A{
    void calc(){
        int x =a+b+c;
        System.out.println("the sum is :" +x);
    }
}
class C extends A{
    void calc1(){
        int y =a*b*c;
        System.out.println("the product is :" +y);
    }
}
 class HR_inherit {
    public static void main(String args[]){
        B ob = new B();
        C ob1 = new C();
        ob.calc();
        ob1.calc1();
    }
    
}
