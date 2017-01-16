/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.service;

import com.bonvio.dao.PeopleDao;
import com.bonvio.model.People;
import com.bonvio.model.Site;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;;

/**
 *
 * @author dmitriy
 */
@Service
public class PeopleServiceImpl implements PeopleService{
    
    @Autowired
    PeopleDao peopleDao;

    @Override
    @Transactional
    public List<People> get() {
        return peopleDao.get();
    }

    @Override
    @Transactional
    public void add(People people) {
        peopleDao.add(people);
    }

    @Override
    @Transactional
    public void update(People people) {
        peopleDao.update(people);
    }

    @Override
    @Transactional
    public void delete(People people) {
        peopleDao.delete(people);
    }

    @Override
    public People getById(long id) {
        return peopleDao.getById(id);
    }

    @Override
    public List<Site> getSite(long id) {
        return peopleDao.getSite(id);   
    }

    
}
