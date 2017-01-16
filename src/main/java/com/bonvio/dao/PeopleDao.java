/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.dao;

import com.bonvio.model.People;
import com.bonvio.model.Site;
import java.util.List;

/**
 *
 * @author dmitriy
 */
public interface PeopleDao {
    List<People> get();
    
    List<Site> getSite( long id);
    
    People getById(long id);

    void add(People site);

    void update(People site);

    void delete(People site);
}
