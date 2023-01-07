package az.iktlab.lessons.lesson28;

import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sql_q5",
                    "postgres",
                    "root");

            Statement stmt = con.createStatement();

//            stmt.execute("insert into sch_q5.person(id, name, surname, age)" +
//                    "values (4,'Ali', 'Mardanov', 98);");

//            stmt.execute("update sch_q5.person set age=11 where id = 4;");

//            stmt.execute("DELETE FROM sch_q5.person where id = 3;");

            ResultSet rs = stmt.executeQuery("select * from sch_q5.user;");

            while (rs.next()) {
                Long id = rs.getLong("id");
                String username = rs.getString("username");
                String pass = rs.getString("password");

                System.out.printf("id: %s , username: %s , password: %s \n", id, username, pass);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
