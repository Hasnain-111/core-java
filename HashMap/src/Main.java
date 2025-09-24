import java.util.*;
public class Main {
    public static void main(String args[]){
     HashMap<String,Integer> map = new HashMap<>();
    map.put("china",120);
    map.put("Indaa", 78);
    map.put("russsia",908);
//    System.out.println(map);
//    
//    //search
//    if(map.containsKey("no")){
//        System.out.println("hasnain");
//    }
//    System.out.println(map.get("china"));
//    System.out.println(map.get("Hasnain"));
    for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        
    }
    
    }
    
    
}
