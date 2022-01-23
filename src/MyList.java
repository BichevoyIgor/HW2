public interface MyList<T> {
    void add(T t);
    T get(int index);
    void clear();
    boolean isEmpty();
    void remove(int index);
    int size();

}
