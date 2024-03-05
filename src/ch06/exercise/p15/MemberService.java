package ch06.exercise.p15;

public class MemberService {

    boolean login(String id, String password) {
        if (id.equals("hong")) {
            if (password.equals("12345")) {
                return true;
            }
        }
        return false;
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
        return;
    }
}
