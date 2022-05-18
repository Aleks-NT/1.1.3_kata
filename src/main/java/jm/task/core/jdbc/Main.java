package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.sql.SQLException;



public class Main {
    public static void main(String[] args) throws SQLException {
        UserService service = new UserServiceImpl();

        service.createUsersTable();

        service.saveUser("Иван", "Стрельцов", (byte) 23);
        service.saveUser("Алена", "Вишневская", (byte) 28);
        service.saveUser("Максим", "Карпин", (byte) 20);
        service.saveUser("Наталья", "Соловьева", (byte) 33);

        service.getAllUsers();

        service.cleanUsersTable();

        service.dropUsersTable();


        // реализуйте алгоритм здесь
    }
}