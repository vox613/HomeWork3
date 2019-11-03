package innopolis.homework3;

public class Bucket {
    private Node currentNode;
    private int numOfNodes;

    Bucket() {
        this.currentNode = null;
        this.numOfNodes = 0;
    }


    Object add(Node node) {
        Object temp;
        Node currentNodeCopy = currentNode;

        if (currentNodeCopy != null) {
            Node saveLink = currentNodeCopy;
            while (currentNodeCopy != null) {
                if (node.getKey() == null) {
                    if (currentNodeCopy.getKey() == null) {
                        temp = currentNodeCopy.getValue();
                        currentNodeCopy.setValue(node.getValue());
                        return temp;
                    }
                } else {
                    if (node.getKey().equals(currentNodeCopy.getKey())) {
                        temp = currentNodeCopy.getValue();
                        currentNodeCopy.setValue(node.getValue());
                        return temp;
                    }
                }
                currentNodeCopy = currentNodeCopy.getLinkToNextNode();
                if (currentNodeCopy != null) {
                    saveLink = currentNodeCopy;
                }
            }
            numOfNodes++;
            saveLink.setLinkToNextNode(node);
            return null;
        } else {
            numOfNodes++;
            currentNode = node;
            return null;
        }
    }


    Node takeNode(Object key) {
        Node currentNodeCopy = currentNode;

        if (currentNodeCopy != null) {
            while (currentNodeCopy != null) {
                if (key == null) {
                    if (currentNodeCopy.getKey() == null) {
                        return currentNodeCopy;
                    }
                } else {
                    if (key.equals(currentNodeCopy.getKey())) {
                        return currentNodeCopy;
                    }
                }
                currentNodeCopy = currentNodeCopy.getLinkToNextNode();
            }
            return null;
        } else {
            return null;
        }
    }


    public String toString() {
        StringBuilder str = new StringBuilder("");
        Node currentNodeCopy = currentNode;
        if (currentNodeCopy != null) {
            while (currentNodeCopy != null) {
                str.append(currentNodeCopy.toString());
                str.append(" ");
                currentNodeCopy = currentNodeCopy.getLinkToNextNode();
            }
        } else {
            return str.toString();
        }
        return str.toString();
    }


    Object removeNode(Object key) {
        Object temp;
        Node currentNodeCopy = currentNode;
        Node prevLink = null;

        if (currentNodeCopy != null) {
            while (currentNodeCopy != null) {
                if (key == null) {
                    if (currentNodeCopy.getKey() == null) {
                        temp = currentNodeCopy.getValue();
                        if (prevLink == null) {
                            currentNode = currentNodeCopy.getLinkToNextNode();
                        } else {
                            prevLink.setLinkToNextNode(currentNodeCopy.getLinkToNextNode());
                        }
                        numOfNodes--;
                        return temp;
                    }
                } else {
                    if (key.equals(currentNodeCopy.getKey())) {
                        temp = currentNodeCopy.getValue();
                        if (prevLink == null) {
                            currentNode = currentNodeCopy.getLinkToNextNode();
                        } else {
                            prevLink.setLinkToNextNode(currentNodeCopy.getLinkToNextNode());
                        }
                        numOfNodes--;
                        return temp;
                    }
                }
                prevLink = currentNodeCopy;
                currentNodeCopy = currentNodeCopy.getLinkToNextNode();
            }
            return null;
        } else {
            return null;
        }
    }

    public int getNumOfEntry() {
        return numOfNodes;
    }

}
