package ch09.exercise.p7;

public class ChattingExample {
    public static void main(String[] args) {
        Chatting chatting = new Chatting();
        chatting.startChat("nick");

        Chatting.Chat chat = new Chatting.Chat();
        chat.sendMessage("hello");

        System.out.println();
    }
}
