package innopolis.homework3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        NewMap<Integer, String> newMap = new NewMap<>(16);

        //Set<Map.Entry<Integer, String>> stSet = stMap.entrySet();
        Set<Map.Entry<Integer, String>> mySet = newMap.entrySet();

        System.out.println("\n>>>  isEmpty map test  <<<");
        System.out.println("isEmpty map = " + newMap.isEmpty());
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);

        System.out.println("\n>>>  Put test  <<<");
        newMap.put(1, "2");
        newMap.put(3, "4");
        newMap.put(5, "6");
        newMap.put(null, "nope");
        newMap.put(7, "8");
        newMap.put(0, "9");
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);


        System.out.println("\n>>>  Contains test  <<<");
        System.out.println("Have value for Key " + "1 -  " + newMap.containsKey(1));
        System.out.println("Have value for Key " + "3    -  " + newMap.containsKey(3));
        System.out.println("Have value for Key " + "9  -  " + newMap.containsKey(9));
        System.out.println("Have value for Key " + "null -  " + newMap.containsKey(null));
        System.out.println("Have value for Key " + "10   -  " + newMap.containsKey(10));
        System.out.println("Have value for Key " + "0 -  " + newMap.containsKey(0));
        System.out.println();
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);


        System.out.println("\n>>>  Size test  <<<");
        System.out.println(">>>>> Map size  = " + newMap.size());
        System.out.println("Put new pair    = " + newMap.put(123, "456") + " size = " + newMap.size());
        System.out.println("Put new pair    = " + newMap.put(789, "1011") + " size = " + newMap.size());
        System.out.println("Put new pair    = " + newMap.put(null, "/null/") + " size = " + newMap.size());
        System.out.println("Put same pair   = " + newMap.put(0, "zero") + " size = " + newMap.size());
        System.out.println("Remove same pair= " + newMap.remove(789) + " size = " + newMap.size());
        System.out.println("myMap entrySet = " + mySet);

        System.out.println("\n>>>  Get test  <<<");
        System.out.println("Get pair via key 0      = " + newMap.get(0));
        System.out.println("Get pair via key 789    = " + newMap.get(789));
        System.out.println("Get pair via key null   = " + newMap.get(null));
        System.out.println("Get pair via key 9      = " + newMap.get(9));
        System.out.println("Remove pair = " + newMap.remove(123));
        System.out.println("myMap entrySet = " + mySet);

        System.out.println("\n>>>  Remove test  <<<");
        System.out.println("Map before removing :");
        System.out.println(newMap.toString());
        newMap.remove(10);
        newMap.remove(5);
        newMap.remove(543);
        newMap.remove(0);
        newMap.remove(null);
        System.out.println("\nMap after removing :");
        System.out.println(newMap.toString());
        System.out.println("\nSize   - " + newMap.size());
        System.out.println("myMap entrySet = " + mySet);


        System.out.println("\n>>>  PutAll test  <<<");
        Map<Integer, String> maps = new HashMap<>();

        for (int i = 0; i <= 100; i++) {
            maps.put(i, i + "~");
        }
        System.out.println("myMap entrySet = " + mySet);

        System.out.println("Map before PutAll :");
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);
        newMap.putAll(maps);
        System.out.println("\nMap after PutAll :");
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);

        System.out.println("\n>>>  EntrySet test  <<<");
        System.out.println(newMap.entrySet().toString());


        System.out.println("\n>>>  KeySet test  <<<");
        System.out.println(newMap.keySet());

        System.out.println("\n>>>  Values test  <<<");
        System.out.println(newMap.values());

        System.out.println("\n>>>  Contains value test  <<<");
        System.out.println("containsValue(\"100~\") = " + newMap.containsValue("100~"));
        System.out.println("containsValue(\"101~\") = " + newMap.containsValue("101~"));

        System.out.println("\n>>>  Clear test  <<<");
        System.out.println("Map before clear :");
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);
        newMap.clear();
        System.out.println("\nMap after clear :");
        System.out.println(newMap.toString());
        System.out.println("myMap entrySet = " + mySet);
    }

}
