package ch13;

public class C02GenericType {
    public static void main(String[] args) {
        C02Box<String> box1 = new C02Box<String>();
        C02Box<Integer> box2 = new C02Box<Integer>();

        box1.setItem("java");
        String item = box1.getItem();

        box2.setItem(300);
        Integer item1 = box2.getItem();
    }
}

// <> : Type Parameter
// Type Parameter 이름 작성 관습
// : 대문자 한글자로 사용
// 주로 쓰는 이름들
// T : Type || E : Element || K  : Key || V : Value
// S, U, V : T 다음에 있는 알파벳 순서
class C02Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}