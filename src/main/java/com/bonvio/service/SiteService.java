package com.bonvio.service;

import com.bonvio.model.Site;

import java.util.List;

public interface SiteService {

    List<Site> getSites();

    void addSite(Site site);

    void updateSite(Site site);

    void deleteSite(Site site);

}
