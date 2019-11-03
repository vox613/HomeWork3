package innopolis.homework3;

public class  Node {
    private Object key;
    private Object value;
    private int keyHashCode;
    private Node linkToNextNode;


    Node(Object key, Object value) {
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

    void setValue(Object value) {
        this.value = value;
    }

    Object getKey() {
        return key;
    }

    Object getValue() {
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
