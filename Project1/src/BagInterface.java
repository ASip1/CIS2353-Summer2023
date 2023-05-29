public interface BagInterface<T> {
    public int getCurrentSize();

    public boolean isEmpty();

    public boolean add(T newEntry);

    public boolean remove(T anEntry);

    public T remove();

    public void clear();

    public int getFrequencyOf(T anEntry);

    public boolean contains(T anEntry);

    public T[] toArray();
}
