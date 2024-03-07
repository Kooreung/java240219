package ch06.exercise.p14;

public class Member {
        // 이름, 아이디, 패스워드, 나이
        private String name;
        private String id;

        public Member(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
