package com.bonvio.service;

import com.bonvio.model.People;
import com.bonvio.model.Site;
import java.util.List;

/**
 *
 * @author dmitriy
 */
public interface PeopleService {
    List<People> get();
    
    List<Site> getSitesByPeopleId( long id);
    
    People getById(long id);

    void add(People site);

    void update(People site);

    void delete(People site);
}
