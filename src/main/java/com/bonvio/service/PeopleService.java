package com.bonvio.service;

import com.bonvio.model.People;
import java.util.List;

/**
 *
 * @author dmitriy
 */
public interface PeopleService {
    List<People> get();

    void add(People people);

    void update(People people);

    void delete(People people);
}
