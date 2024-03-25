package ch11.lecture.p2throw;

import java.sql.SQLException;

public class C06Throw {

    public static void someMethod1() throws ClassNotFoundException, SQLException {
        boolean b1 = true;
        boolean b2 = true;

        if (b1) {
            throw new ClassNotFoundException();
        }

        if (b2) {
            throw new SQLException();
        }
    }
}
