package ua.com.owu.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("i2")
@Transactional
public class UserDAOImpl2 implements UserDAO{
    @PersistenceContext
    private EntityManager manager;
    public void save(User user) {
        if (user != null){
            manager.persist(user);
        } else {
            System.out.println("Error!!!!");
        }

    }
}