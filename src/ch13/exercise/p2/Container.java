package ch13.exercise.p2;

public class Container<T> {

    public T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}
