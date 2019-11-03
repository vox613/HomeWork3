package innopolis.homework3;

public class NewMap {
    private final int mapCapacity;
    private Bucket[] bucketMass;


    NewMap(int mapCapacity) {
        this.mapCapacity = mapCapacity;
        bucketMass = new Bucket[mapCapacity];
        for (int i = 0; i < mapCapacity; i++) {
            bucketMass[i] = new Bucket();
        }
    }


    Object put(Object key, Object value) throws ArrayIndexOutOfBoundsException {
        if (key == null) {
            return bucketMass[0].add(new Node(key, value));
        } else {
            return bucketMass[getIndex(key)].add(new Node(key, value));
        }
    }


    boolean containsKey(Object key) {
        int index = ((key == null) ? 0 : getIndex(key));
        return (bucketMass[index].takeNode(key) != null);
    }


    Object get(Object key) {
        int index = ((key == null) ? 0 : getIndex(key));
        Node tempNode = bucketMass[index].takeNode(key);
        return (tempNode == null) ? null : tempNode.getValue();
    }



    int size() {
        int size = 0;
        for (int i = 0; i < mapCapacity; i++) {
            size += bucketMass[i].getNumOfEntry();
        }
        return size;
    }


    Object remove(Object key) {
        int index = (key == null) ? 0 : getIndex(key);
        if (containsKey(key)) {
            return bucketMass[index].removeNode(key);
        } else {
            return null;
        }
    }



    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < mapCapacity; i++) {
            //System.out.println("Bucket " + i + " : " + bucketMass[i].toString());
            str.append("Bucket ").append(i).append(" : ");
            str.append(bucketMass[i].toString());
            str.append("\n");
        }
        return str.toString();
    }


    private int getIndex(Object key) {
        return newHash(key.hashCode());
    }

    private int newHash(int keyHashCode) {
        return (keyHashCode & (mapCapacity - 1));
    }

}
