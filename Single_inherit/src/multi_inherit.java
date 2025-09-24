class A{
int a =10;
}
class B extends A{
int b = a*a;
}
class C extends B{
void display(){
System.out.println("The value of a="+a);
System.out.println("The value of b ="+b);
}
}
class multi_inherit{
public static void main(String a[]){
C ob = new C();
ob.display();
}
}