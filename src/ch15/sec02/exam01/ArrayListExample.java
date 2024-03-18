package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // 저장 된 총 객체 수 읽기 | size
        int size = list.size();
        System.out.println("총 객체 수 = " + size);
        System.out.println();

        // 특정 인덱스 객체 가져오기 | get
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // 모든 객체 하나씩 가져오기
        for (int i = 0 ; i < list.size() ; i++) {
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
            System.out.println();
        }

        // 객체 삭제하기 | remove | 2번 index 삭제 시 3번 index 가 2번으로 되므로 2번 제거 가능
        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }

        // 전체 탐색 (Lambda)
        list.forEach(System.out::println);
    }
}
