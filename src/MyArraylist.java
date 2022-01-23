
public class MyArraylist<T> implements MyList<T> {
    private int size;
    private int capacity = 10;
    private Object[] array = new Object[capacity];

    @Override
    public void add(T item) {
        if (size == capacity - 1) resizeArray();
        array[size] = item;
        size++;

    }

    private void resizeArray() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public void clear() {
        capacity = 10;
        size = 0;
        array = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    @Override
    public void remove(int index) {
        capacity -=1;
        Object[] newArray = new Object[capacity];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        size -= 1;
        array = newArray;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append("[" + array[i] + "]\n");

        }
        return result.toString();
    }
}
