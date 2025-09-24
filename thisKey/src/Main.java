class Key{
    int a,b;
    Key(int a, int b){
        this.a=a;
        this.b=b;
    }
    void disp(){
        System.out.println(a+ " "+b);
    }
}
public class Main {
    public static void main(String args[]){
        Key ob = new Key(20,30);
        ob.disp();
    }
}
