package pbo.model;

public class Box<T> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int compareTo(Box<T> other) {
        if (this.value instanceof Comparable && other.value instanceof Comparable) {
            Comparable<T> thisVal = (Comparable<T>) this.value;
            return thisVal.compareTo(other.value);
        }
        return 0;
    }
}