package ru.kpfu.itis.bagaviev.physics.util.collections;

public class LimitedSet<T> {

    private final T[] array;
    private int cursor;

    private void validateIndex(int index) {
        if (index >= array.length || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public LimitedSet(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.cursor = 0;
    }

    public int add(T object) {
        int oldIndex = cursor;
        array[cursor++] = object;
        return oldIndex;
    }

    public void remove(int index) {
        array[index] = null;
    }

    public T get(int index) {
        validateIndex(index);
        return array[index];
    }



}
