package innopolis.homework3;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*NewMap newMap = new NewMap(16);

        //newMap.put(22, "22");
        //newMap.put("rg74", 81);
        //newMap.put("egwg", 1);


        System.out.println(">>> SIze = " + newMap.size());

        for (int i = 0; i < 120; i++) {
            System.out.println("put(" + i + "," + i + ") = " + newMap.put(i, i));
            System.out.println(">>> SIze = " + newMap.size());
        }


        System.out.println("put(null, null) = " + newMap.put(null, null));
        System.out.println("put(null, null) = " + newMap.put(null, 1));
        System.out.println("put(null, null) = " + newMap.put(112, 1));
        System.out.println("put(null, null) = " + newMap.put(0, 1));
        System.out.println("put(null, null) = " + newMap.put(128, "хуй"));
        System.out.println("put(null, null) = " + newMap.put(15, "хуй"));

        System.out.println(">>> SIze = " + newMap.size());

        System.out.println(newMap.toString());

        System.out.println("Have key 0      = " + newMap.containsKey(0));
        System.out.println("Have key null   = " + newMap.containsKey(null));
        System.out.println("Have key 15     = " + newMap.containsKey(15));
        System.out.println("Have key 11     = " + newMap.containsKey(111));
        System.out.println("Have key 12345  = " + newMap.containsKey(12345));
        System.out.println();

        System.out.println("Value for key 0      = " + newMap.get(0));
        System.out.println("Value for key null   = " + newMap.get(null));
        System.out.println("Value for key 15     = " + newMap.get(15));
        System.out.println("Value for key 11     = " + newMap.get(111));
        System.out.println("Value for key 12345  = " + newMap.get(12345));
        System.out.println();


        System.out.println(newMap.toString());
        System.out.println(">>> SIze = " + newMap.size());
        System.out.println();
        System.out.println("Delete pair with key 0      = " + newMap.remove(0));
        System.out.println("Delete pair with key null   = " + newMap.remove(null));
        System.out.println("Delete pair with key 15     = " + newMap.remove(15));
        System.out.println("Delete pair with key 11     = " + newMap.remove(111));
        System.out.println("Delete pair with key 12345  = " + newMap.remove(12345));
        System.out.println();
        System.out.println(newMap.toString());
        System.out.println(">>> SIze = " + newMap.size());
        System.out.println();

        for (int i = 0; i < 256; i+=16) {
            System.out.println("Delete pair with key " + i + "  = " + newMap.remove(i));
        }

        System.out.println(newMap.toString());
        System.out.println(">>> SIze = " + newMap.size());
        System.out.println();

        //newMap.put(16, 0);
        //System.out.println(newMap.toString());

*/



        NewMap newMap = new NewMap(16);
        System.out.println("\n>>>  Empty map  <<<");
        System.out.println(newMap.toString());

        System.out.println("\n>>>  Put test  <<<");
        newMap.put(22, "22");
        newMap.put(5, "1");
        newMap.put(543, "1");
        newMap.put("egwg", 1);
        newMap.put(5.4f, "1");
        newMap.put(543L, 1);
        newMap.put("rg2g", 0);
        newMap.put("mtm", 4);
        newMap.put("4t", 9);
        newMap.put("rg74", 81);
        newMap.put(0, 0);
        newMap.put("9g4/", 4);
        newMap.put(0, "1");
        newMap.put(null, "nope");
        System.out.println(newMap.toString());


        System.out.println("\n>>>  Contains test  <<<");
        System.out.println("Have value for Key " + "rg74 -  " + newMap.containsKey("rg74"));
        System.out.println("Have value for Key " + "0    -  " + newMap.containsKey(0));
        System.out.println("Have value for Key " + "9g4  -  " + newMap.containsKey("9g4/"));
        System.out.println("Have value for Key " + "null -  " + newMap.containsKey(null));
        System.out.println("Have value for Key " + "58   -  " + newMap.containsKey(58));
        System.out.println("Have value for Key " + "egwg -  " + newMap.containsKey("egwg"));
        System.out.println(newMap.toString());

        System.out.println("\n>>>  Size test  <<<");
        System.out.println(">>>>> Map size = " + newMap.size());
        System.out.println("Put new pair = " + newMap.put("newEl", 159) + " size = " + newMap.size());
        System.out.println("Put new pair = " + newMap.put("852", 466) + " size = " + newMap.size());
        System.out.println("Put new pair = " + newMap.put(null, 466) + " size = " + newMap.size());
        System.out.println("Put same pair = " + newMap.put("newEl", 852) + " size = " + newMap.size());
        System.out.println("Remove same pair = " + newMap.remove("newEl") + " size = " + newMap.size());

        System.out.println("\n>>>  Get test  <<<");
        System.out.println("Get pair with key newEl     = " + newMap.get("newEl"));
        System.out.println("Get pair with key 852       = " + newMap.get("852"));
        System.out.println("Get pair with key null      = " + newMap.get(null));
        System.out.println("Remove pair with key 852  = " + newMap.remove("852"));
        System.out.println("Get pair with key 852     = " + newMap.get("852"));

        System.out.println("\n>>>  Remove test  <<<");
        System.out.println("Map before removing :");
        System.out.println(newMap.toString());
        newMap.remove(22);
        newMap.remove(5);
        newMap.remove(543);
        newMap.remove("egwg");
        newMap.remove(5.4f);
        newMap.remove(543L);
        newMap.remove("rg2g");
        newMap.remove("mtm");
        newMap.remove("4t");
        newMap.remove("rg74");
        newMap.remove(0);
        newMap.remove("9g4/");
        newMap.remove("852");
        newMap.remove(0);
        newMap.remove(null);
        System.out.println("\nMap after removing :");
        System.out.println(newMap.toString());


        System.out.println("\nSize   - " + newMap.size());



    }


}
