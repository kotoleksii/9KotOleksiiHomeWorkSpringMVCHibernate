package org.example.dao;

import org.example.entity.Number;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class NumberDAOImpl implements NumberDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Number> getAllNumbers() {
        Session session = sessionFactory.getCurrentSession();
        List<Number> numbers = session.createQuery("from Number", Number.class).getResultList();

        return numbers;
    }

    @Override
    public void saveNumber(Number number) {

    }

    @Override
    public Number getNumberById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Number number = session.get(Number.class, id);
        return number;
    }

    @Override
    public void deleteNumberById(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("delete from Number where id =" + id).executeUpdate();
    }
}
