class nomatch extends Exception{    
}
class Throweg{
    void check(String s1)throws nomatch{ //because it is not handlin this excepption using try catch
        char ch;
        ch = s1.charAt(0);
        if(ch=='M'){
            System.out.println("Valid id");
        }else{
            throw new nomatch();
        }
    }
}
class main{
public static void main(String args[]){
Throweg ob = new Throweg();
try{
    ob.check("Hasnain");
}catch(nomatch e){
    System.out.println("invalid id");
}
finally{
    System.out.println("Thanks");
}
}
}

