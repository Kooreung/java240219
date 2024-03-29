package ch08.exercise.p7;

public class MySqlDao implements DataAccessObject{
    String DbName = "MySql DB";

    @Override
    public void select() {
        System.out.println(DbName + "에서 검색");
    }

    @Override
    public void insert() {
        System.out.println(DbName + "에서 삽입");
    }

    @Override
    public void update() {
        System.out.println(DbName + "에서 수정");
    }

    @Override
    public void delete() {
        System.out.println(DbName + "에서 삭제");
    }
}
