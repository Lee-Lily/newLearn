package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "保存成功！";
    }
}
