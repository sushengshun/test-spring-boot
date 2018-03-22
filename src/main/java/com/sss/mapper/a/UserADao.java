package com.sss.mapper.a;

import com.sss.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserADao {

    public List<User> getAll();

    public User getOne(int id);

    public void insert(User user);

    public void update(User user);

    public int delete(int id);

    public void updateTest(String id, String name);

}
