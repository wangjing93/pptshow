package cn.wj.pptshow.repository;

import cn.wj.pptshow.entity.User;

/**
 * Created by WangJing on 2017/4/1.
 */
public interface UserMapper {
    User findUserById(Integer id);
    int addUser(User user);
}
