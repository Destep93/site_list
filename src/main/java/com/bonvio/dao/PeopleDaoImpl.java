/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonvio.dao;

import com.bonvio.model.People;
import com.bonvio.model.Site;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

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
         entityManager.remove(entityManager.getReference(People.class,people.getPeople_id()));
    }

    @Override
    public People getById(long id) {
        return entityManager.find(People.class, id);
    }

    @Override
    public List<Site> getSitesByPeopleId(long id) {
        String getSiteById = "SELECT s FROM Site s where s.people_id = :people_id";
        List<Site> sites = entityManager.createQuery(getSiteById, Site.class)
                .setParameter("people_id", id).getResultList();

        return sites;
    }
    
}
