package org.example.service;

import org.example.dao.NumberDAO;
import org.example.entity.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberDAO numberDAO;

    @Override
    @Transactional
    public List<Number> getAllNumbers() {
        return numberDAO.getAllNumbers();
    }

    @Override
    public void saveNumber(Number number) {

    }

    @Override
    public Number getNumberById(int id) {
        return null;
    }

    @Override
    public void deleteNumberById(int id) {

    }
}
