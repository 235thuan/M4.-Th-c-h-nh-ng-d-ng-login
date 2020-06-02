package login.service;

import login.model.Login;
import login.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserLogInImpl {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setUserAge(10);
        u1.setUserName("John");
        u1.setUserAccount("john");
        u1.setUserEmail("john@codegym.vn");
        u1.setUserPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setUserAge(15);
        u2.setUserName("Bill");
        u2.setUserAccount("bill");
        u2.setUserEmail("bill@codegym.vn");
        u2.setUserPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setUserAge(16);
        u3.setUserName("Mike");
        u3.setUserAccount("mike");
        u2.setUserEmail("mike@codegym.vn");
        u3.setUserPassword("123456");
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getUserAccount().equals(login.getLoginAccount())
                    && u.getUserPassword().equals(login.getLoginPassword())){
                return u;
            }
        }
        return null;
    }
}
