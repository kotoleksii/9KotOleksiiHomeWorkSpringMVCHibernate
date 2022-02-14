package org.example.dao;

import org.example.entity.Number;

import java.util.List;

public interface NumberDAO {
    List<Number> getAllNumbers();

    void saveNumber(Number number);

    Number getNumberById(int id);

    void deleteNumberById(int id);
}
