class Throwe{
    void check(String s1){
        char ch;
        ch = s1.charAt(0);
        if(ch=='A'){
            System.out.println("valid id");
        }else{
            try{
                throw new ArithmeticException();
            }catch(ArithmeticException e){
                System.out.println("Invalid Id");
            }
        }
    }
}
public class Main {
    public static void main(String args[]){
        Throwe ob = new Throwe();
        ob.check("aasnain");
    } 
    
}
