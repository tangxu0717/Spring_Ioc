package com.ioc.test.dao;

import com.ioc.test.User;

/**
 * Created by tangxu on 2017/1/9.
 */
public class UserDao implements IUserDao {
    @Override
    public void add(User user) {
        System.out.println("add:"+user);
    }

    @Override
    public void delete(int id) {
        System.out.println("delete:"+id);
    }

    @Override
    public User load(int id) {
        System.out.println("load:"+id);
        return null;
    }
}
