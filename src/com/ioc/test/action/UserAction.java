package com.ioc.test.action;

import com.ioc.test.User;
import com.ioc.test.service.IUserService;

/**
 * Created by tangxu on 2017/1/9.
 */
public class UserAction {
    private User user;
    private final ThreadLocal<IUserService> userService = new ThreadLocal<>();
    private int id;

    public void add(){
        userService.get().add(user);
    }

    public void delete(){
        userService.get().delete(id);
    }

    public void load(){
        userService.get().load(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService.get();
    }

    public void setUserService(IUserService userService) {
        this.userService.set(userService);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
