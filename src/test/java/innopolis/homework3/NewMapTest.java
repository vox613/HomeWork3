package innopolis.homework3;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class NewMapTest {
    private int mapCapacity = 16;
    private NewMap<Integer, String> newMap = new NewMap<>(mapCapacity);
    private Map<Integer, String> standartMap = new HashMap<>();
    private Random rand = new Random();


    @Before
    public void cleanMaps() {
        standartMap.clear();
        newMap.clear();
        newMap.put(1, "first");
        newMap.put(2, "null");
        standartMap.put(1, "first");
        standartMap.put(2, "null");

    }


    @Test
    public void put() {
        assertNull(standartMap.put(1, "first"));
        assertNull(newMap.put(2, "null"));
        assertNull(standartMap.put(1, "first"));
        assertNull(standartMap.put(2, "null"));
        assertEquals(standartMap.get(1), newMap.get(1));
        assertEquals(standartMap.get(2), newMap.get(2));
        assertEquals(standartMap.put(1, "second"), newMap.put(1, "second"));
        assertEquals(standartMap.put(1, "secondNull"), newMap.put(1, "secondNull"));
    }


    @Test
    public void get() {
        assertEquals(standartMap.get(1), newMap.get(1));
        assertEquals(standartMap.get(2), newMap.get(2));
        assertEquals(standartMap.get(123), newMap.get(123));
    }


    @Test
    public void remove() {
        assertEquals(standartMap.remove(1), newMap.remove(1));
        assertNull(newMap.get(1));
        assertNull(standartMap.get(1));
    }

    @Test
    public void containsKey() {
        assertEquals(standartMap.containsKey(1), newMap.containsKey(1));
        assertEquals(standartMap.containsKey(5), newMap.containsKey(5));
    }

    @Test
    public void size() {
        standartMap.clear();
        newMap.clear();
        for (int i = 0; i < 500; i++) {
            newMap.put(i, i + "n");
            standartMap.put(i, i + "s");
        }
        assertEquals(standartMap.size(), newMap.size());
        newMap.put(1, "first");
        standartMap.put(2, "null");
        assertEquals(standartMap.size(), newMap.size());
    }


    @Test
    public void isEmpty() {
        assertEquals(standartMap.size(), newMap.size());
        newMap.put(1, "first");
        standartMap.put(2, "null");
        assertEquals(standartMap.size(), newMap.size());
        newMap.remove(1);
        standartMap.remove(2);
        assertEquals(standartMap.size(), newMap.size());
    }

    @Test
    public void clear() {
        assertEquals(standartMap.isEmpty(), newMap.isEmpty());
        for (int i = 0; i < 500; i++) {
            newMap.put(rand.nextInt(500), "" + rand.nextInt(100));
            standartMap.put(rand.nextInt(500), "" + rand.nextInt(100));
        }
        standartMap.clear();
        newMap.clear();
        assertEquals(standartMap.isEmpty(), newMap.isEmpty());

    }

    @Test
    public void containsValue() {
        assertEquals(standartMap.containsValue("first"), newMap.containsValue("first"));
        assertEquals(standartMap.containsValue("1"), newMap.containsValue("10"));
        newMap.put(5, "qwerty");
        standartMap.put(789, "qwerty");
        assertEquals(standartMap.containsValue("qwerty"), newMap.containsValue("qwerty"));
    }

    @Test
    public void putAll() {
        standartMap.clear();
        newMap.clear();
        newMap.putAll(standartMap);
        assertEquals(newMap.size(), standartMap.size());

        for (int i = 0; i < 500; i++) {
            standartMap.put(i, "" + i);
        }
        newMap.putAll(standartMap);
        assertEquals(newMap.size(), standartMap.size());
    }

    @Test
    public void keySet() {
        standartMap.clear();
        newMap.clear();

        for (int i = 0; i < 500; i++) {
            standartMap.put(i, "" + i);
            newMap.put(i, "" + i);
        }

        Set<Integer> standartset = standartMap.keySet();
        Set<Integer> newset = newMap.keySet();

        for (Integer integer : standartset) {
            assertTrue(newset.contains(integer));
        }

    }


    @Test
    public void values() {
        standartMap.clear();
        newMap.clear();
        for (int i = 0; i < 500; i++) {
            standartMap.put(i, "" + i);
            newMap.put(i, "" + i);
        }

        Collection<String> standartset = standartMap.values();
        Collection<String> newset = newMap.values();

        for (String str : standartset) {
            assertTrue(newset.contains(str));
        }
    }

    @Test
    public void entrySet() {

        standartMap.clear();
        newMap.clear();

        Set<Map.Entry<Integer, String>> standartEntrySet = standartMap.entrySet();
        Set<Map.Entry<Integer, String>> newEntrySet = newMap.entrySet();

        for (int i = 0; i < 10000; i++) {
            standartMap.put(i, "" + 5);
            newMap.put(i, "" + 5);
        }

        for (int i = 0; i < 1985; i += 3) {
            standartMap.remove(i);
            newMap.remove(i);
        }

        assertEquals(standartEntrySet.size(), newEntrySet.size());
        boolean outFlag = true;
        for (Map.Entry<Integer, String> stPair : standartEntrySet) {
            boolean innerFlag = false;
            for (Map.Entry<Integer, String> myPair : newEntrySet) {
                innerFlag |= myPair.getKey().equals(stPair.getKey()) && myPair.getValue().equals(stPair.getValue());
                if (innerFlag) {
                    System.out.println("myPair.getKey().equals(stPair.getKey())         = " + myPair.getKey().equals(stPair.getKey()));
                    System.out.println("myPair.getValue().equals(stPair.getValue())     = " + myPair.getValue().equals(stPair.getValue()));
                    System.out.println();
                    break;
                }
            }
            if (!innerFlag) {
                outFlag = false;
                assertTrue(outFlag);
                System.out.println("Have not this Pair !");
                break;
            }
        }
        assertTrue(outFlag);
    }
}