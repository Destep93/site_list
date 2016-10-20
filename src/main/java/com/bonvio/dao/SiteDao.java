package com.bonvio.dao;

import com.bonvio.model.Site;

import java.util.List;

public interface SiteDao {

    List<Site> getSites();

    void addSite(Site site);

    void updateSite(Site site);

    void deleteSite(Site site);
}
