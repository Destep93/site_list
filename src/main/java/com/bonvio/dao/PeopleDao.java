/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.dao;

import com.bonvio.model.People;
import java.util.List;

/**
 *
 * @author dmitriy
 */
public interface PeopleDao {
    List<People> get();

    void add(People site);

    void update(People site);

    void delete(People site);
}
