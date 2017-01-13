/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.dao;

import com.bonvio.model.People;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmitriy
 */
@Repository
public class PeopleDaoImpl implements PeopleDao{

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public List<People> get() {
         return entityManager.createQuery("from People p", People.class).getResultList();
    }

    @Override
    public void add(People people) {
        entityManager.persist(people);
    }

    @Override
    public void update(People people) {
        entityManager.merge(people);
    }

    @Override
    public void delete(People people) {
         entityManager.remove(entityManager.getReference(People.class,people.getId()));
    }
    
}
