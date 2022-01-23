public class MyLinkedList<T> implements MyList<T> {

    private Entry<T> prev;
    private Entry<T> last;
    private int size;

    public MyLinkedList() {
        this.prev = new Entry(null, null, null);
    }

    @Override
    public void add(T t) {
        if (prev.prev == null) {
            prev.value = t;
            prev.next = new Entry(t, prev, null);
        } else {
            prev.next = new Entry(t, prev, null);
        }
        size++;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return "MyLinkedList{" +
                "entry=" + prev +
                '}';
    }

    private static class Entry<T> {
        private T value;
        private Entry<T> next;
        private Entry<T> prev;

        private Entry(T value, Entry<T> prev, Entry<T> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
