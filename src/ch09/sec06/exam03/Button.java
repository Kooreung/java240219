package ch09.sec06.exam03;

public class Button {
    public static interface ClickListener {
        void onClick(); // abstract method
    } // static nested interface

    private ClickListener clickListener; // field

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    } // method

    public void click() {
        this.clickListener.onClick();
    } // button 이 클릭 되었을 때 실행하는 method
}
