package ch13.lecture.p1generic;

public class C06WildCard {
    public static void main(String[] args) {
        Integer v1 = 100;
        Number v2 = v1;
        Double v3 = 3.14;
        Number v4 = v3;
        Object v5 = v2;
        Object v6 = v4;

        C06Box<Integer> b1 = new C06Box<>();
        C06Box<Number> b11; // = b1 ( x )
        // 이들의 item 의 상관관계를 비교할 때가 있다.
        // 그 때는 상속 관계를 만들어 주어야 한다.
        // 그것이 wildCard
        C06Box<? extends Number> b2 = b1;
        // Number 의 하위 Type 을 받을 수 있도록 해준다.
        C06Box<Double> b3 = new C06Box<>();
        C06Box<? extends Number> b4 = b3;
        C06Box<Object> b5 = new C06Box<>();
        C06Box<? extends Number> b6; // = b5; ( x )
        C06Box<? super Number> b7 = b5; // 상위 타입에 반응
    }
}

class C06Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
