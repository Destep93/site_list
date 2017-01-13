package com.bonvio.service;

import com.bonvio.dao.SiteDao;

import com.bonvio.model.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    SiteDao siteDao;

    @Override
    @Transactional
    public List<Site> getSites() {
        return siteDao.getSites();
    }

    @Override
    @Transactional
    public void addSite(Site site) {
        siteDao.addSite(site);
    }

    @Override
    @Transactional
    public void updateSite(Site site) {
        siteDao.updateSite(site);
    }

    @Override
    @Transactional
    public void deleteSite(Site site) {
        siteDao.deleteSite(site);
    }
}
