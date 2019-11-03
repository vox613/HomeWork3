package innopolis.homework3;

public class Node<K, V> {
    private K key;
    private V value;
    private int keyHashCode;
    private Node linkToNextNode;


    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.linkToNextNode = null;
        if (key == null) {
            this.keyHashCode = 0;
        } else {
            this.keyHashCode = key.hashCode();
        }
    }

    public String toString() {
        return "[" + key + ":" + value + "]";
    }

    void setValue(V value) {
        this.value = value;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    int getKeyHashCode() {
        return keyHashCode;
    }

    Node getLinkToNextNode() {
        return linkToNextNode;
    }

    void setLinkToNextNode(Node linkToNextNode) {
        this.linkToNextNode = linkToNextNode;
    }
}
