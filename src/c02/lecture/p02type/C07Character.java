package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        char a = 8258;
        System.out.println(a);
        char b = 0x2764;
        System.out.println(b);
        char c = '♥';
        System.out.println(c);

        int o = 0x1f687;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);
    }
}
