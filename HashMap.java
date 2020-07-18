package tech.codingclub;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test9 {
    public static void main(String[] args) {

        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running Test 9 at  "+new Date().toString()+" sharp");

        Map<String, String> mp = new HashMap<String, String>();
        mp.put("India","Delhi");
        mp.put("China", "Beijing");
        mp.put("Canada", "Ottawa");

        if(mp.containsKey("India"))
        {
            System.out.println("Capital of Indian is : "+ mp.get("India"));
        }
        if(mp.containsKey("Russia"))
        {
            System.out.println("Capital of India is : "+ mp.get("India") );
        }
        else{
            System.out.println("Capital of Russia is not there");
        }

        System.out.println("Key below");
        for(String key : mp.keySet())
        {
            System.out.println(key);
        }

        System.out.println("Values below");
        for(String value : mp.values())
        {
            System.out.println(value);
        }

        System.out.println("######################");
        for(String key : mp.keySet()){
            System.out.println(key + ":" + mp.get(key));
        }

        mp.remove("China");

        System.out.println("########## After Removing China ############");
        for(String key : mp.keySet()){
            System.out.println(key + ":" + mp.get(key));
        }

        System.out.println("########## Entry Set Example ############");
        for(Map.Entry<String, String> x: mp.entrySet())
        {
            System.out.println(x.getKey()+ ":" + x.getValue());

        }
        mp.clear();








    }
}
