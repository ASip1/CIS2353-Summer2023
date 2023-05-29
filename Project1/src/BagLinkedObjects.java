public  class BagLinkedObjects<T> implements BagInterface<T> {
    private Node firstNode;
    private int numOfEntries;

    public BagLinkedObjects() {
        firstNode = null;
        numOfEntries = 0;
    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(T newInput) {
        return false;
    }

    @Override
    public boolean remove(T anInput) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anInput) {
        return 0;
    }

    @Override
    public boolean contains(T anInput) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    private class Node {
        private T data;
        private Node next;

        private Node(T dPort) {
            this(dPort, null);
        }

        private Node(T dPort, Node nextNode) {
            data = dPort;
            next = nextNode;
        }
    }
}

