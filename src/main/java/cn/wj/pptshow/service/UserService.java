package cn.wj.pptshow.service;

import cn.wj.pptshow.entity.User;
import cn.wj.pptshow.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WangJing on 2017/4/1.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
