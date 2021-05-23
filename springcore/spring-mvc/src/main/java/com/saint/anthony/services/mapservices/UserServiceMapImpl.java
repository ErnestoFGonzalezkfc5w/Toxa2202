package com.saint.anthony.services.mapservices;

import com.saint.anthony.domain.DomainObject;
import com.saint.anthony.domain.User;
import com.saint.anthony.services.UserService;

import java.util.List;

public class UserServiceMapImpl extends AbstractMapService implements UserService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public User getById(Integer id) {
        return (User) super.getById(id);
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return (User) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
