package org.example.service;

import org.example.entity.Number;

import java.util.List;

public interface NumberService {
    List<Number> getAllNumbers();

    void saveNumber(Number number);

    Number getNumberById(int id);

    void deleteNumberById(int id);
}
