package ch13.lecture.p1generic;

public class C04Polymorphism {
    public static void main(String[] args) {

    }
}

class C04Box<T> {
    private T item;

    public void someMethod() {
        System.out.println(item.hashCode());
        System.out.println(item.equals(null));
        System.out.println(item.toString());
        // 아직 item 의 Type 이 무엇인지 모른다.
        // 따라서 Object 의 Method 만큼은 사용 가능하다.
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}