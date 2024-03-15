package ch13.lecture.p1generic;

public class C07WildCard {
    public static void main(String[] args) {
        C07Box<Number> box1 = new C07Box<>();
        method1(box1);
        C07Box<Integer> box2 = new C07Box<>();
        method1(box2);
        C07Box<Number> box3 = new C07Box<>();
        method2(box3);
        C07Box<Object> box4 = new C07Box<>();
        method2 (box4);
    }
    // <Integer> 값을 <Number> 로 바로 넘길 수 없었다.
    // <Integer> 값을 외부로 꺼낸 후 넣는 건 가능하다.
    // 그 때 용이하게 쓸 수 있는 게 아래 있는 WildCard 이다.

    // (? extends) : 상한 와일드카드 (Upper Bounded WildCard)
    // 를 쓰면 값을 안전하게 읽을 수 있다.
    private static void method1(C07Box<? extends Number> box) {
        Number n = box.getItem();
    }

    // (? super) : 하한 와일드카드 (Lower Bounded WildCard)
    // 를 쓰면 값을 안전하게 쓸 수 있다.
    private static void method2(C07Box<? super Number> box) {
        box.setItem(3);
        box.setItem(3.14);
    }

}

class C07Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}