package com.bonvio.dao;

import com.bonvio.model.Site;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SiteDaoImpl implements SiteDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Site> getSites() {
        return entityManager.createQuery("from Site s", Site.class).getResultList();
    }

    @Override
    public void addSite(Site site) {
        entityManager.persist(site);
    }

    @Override
    public void updateSite(Site site) {
        entityManager.merge(site);
    }

    @Override
    public void deleteSite(Site site) {
        entityManager.remove(entityManager.getReference(Site.class,site.getId()));
    }
}
