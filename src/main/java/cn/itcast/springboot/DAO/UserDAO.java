package cn.itcast.springboot.DAO;


import cn.itcast.springboot.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDAO {
    public List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 5; i++) {
            list.add(new User("cjy" + i, 15 + i));
        }
        return list;
    }
}
