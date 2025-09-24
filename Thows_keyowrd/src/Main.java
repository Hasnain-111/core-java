import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException{
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Input three nos:");
        int a = Integer.parseInt(ds.readLine());
        float b = Float.parseFloat(ds.readLine());
        double c = Double.parseDouble(ds.readLine());
        
        System.out.println("Enter a String");
        String ch = ds.readLine();
        System.out.println("String ="+ch);
        System.out.println("3 Nos ="+a+" "+b+" "+c);   
    }   
}
