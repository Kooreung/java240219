package ch12.lecture.p1object;

public class C04Equals {
    public static void main(String[] args) {
        C04Book book1 = new C04Book("짱구는못말려1");
        C04Book book2 = new C04Book("짱");
        C04Book book3 = book2;
        C04Book book4 = new C04Book("짱");

        System.out.println(book4.equals(book1));
        System.out.println(book4.equals(book2));
        System.out.println(book3.equals(book2));
    }
}

class C04Book {
    private String title;

    public C04Book(String title) {
        this.title = title;
    }

    // Override 를 안하면 기본 equals Method 가 숨겨져 있다.
    // hashCode 가 다르지만 parameter 가 같으면 true 가 나오도록 설정
    @Override
    public boolean equals(Object obj) {
        C04Book other = (C04Book) obj;
        return this.title.equals(other.title);
    }
}