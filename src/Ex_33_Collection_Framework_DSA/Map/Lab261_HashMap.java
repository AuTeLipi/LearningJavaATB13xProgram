package Ex_33_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab261_HashMap {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);

        System.out.println("All keys and its values in map: ");
        System.out.println(map);
        System.out.println("Size of the map: " +map.size());
        System.out.println("Is Map Empty: " +map.isEmpty());

        System.out.print("Is the id2 key in Map: ");
        System.out.println(map.containsKey("id2"));

        System.out.print("Is the values in Map: ");
        System.out.println(map.containsValue(99));

        System.out.println("Get all keys: " +map.keySet());
        System.out.println("Get all values: " +map.values());

        System.out.print("Get id3 key value: ");
        System.out.println(map.get("id3"));

        System.out.println("Before removing id3: " +map);
        System.out.println("Removing id3 key: " +map.remove("id3"));
        System.out.println("After removing id3: " +map);




    }
}
