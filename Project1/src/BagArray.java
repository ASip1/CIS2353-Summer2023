public class BagArray<T> implements BagInterface<T> {
    private final T[] bag;
    private int itemCount;
    private static final int DEFAULT_CAPACITY = 20;

    public BagArray() {
        this(DEFAULT_CAPACITY);
    }

    public BagArray(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bag = tempBag;
        itemCount = 0;
    }

    private boolean isArrayFull() {
        return itemCount >= bag.length;
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
    public boolean add(T newEntry) {
        return false;
    }

    @Override
    public boolean remove(T anEntry) {
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
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}

