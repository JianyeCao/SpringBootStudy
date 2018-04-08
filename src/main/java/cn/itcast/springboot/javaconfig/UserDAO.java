package cn.itcast.springboot.javaconfig;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            list.add(new User("cjy" + i, 15 + i));
        }
        return list;
    }
}
