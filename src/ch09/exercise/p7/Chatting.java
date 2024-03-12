package ch09.exercise.p7;

public class Chatting {
    static class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
        String nickName = chatId;

        Chat chat = new Chat() {
            @Override
            public void start() {
                String inputData = "안녕하세요";
                String message = "[" + nickName + "] " + inputData;
                sendMessage(message);
            }
        };

        chat.start();
    }
}
