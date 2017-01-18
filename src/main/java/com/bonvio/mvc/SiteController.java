package com.bonvio.mvc;

import com.bonvio.model.Site;
import com.bonvio.service.PeopleService;
import com.bonvio.service.SiteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping (value = "site")
public class SiteController {

    @Autowired
    SiteService siteService;
    
    @Autowired
    PeopleService peopleService;

    @RequestMapping(method = RequestMethod.GET)
    public String  getSite() {
        return "index";
    }

    @RequestMapping(value = "get" ,method = RequestMethod.GET)
    @ResponseBody
    public Object getSites() {
        return siteService.getSites();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void updateSite(@RequestBody Site site) {
         siteService.updateSite(site);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.CREATED)
    public void printWelcome(@RequestBody Site site) {
        site.setPeople(peopleService.getById(site.getPeople_id()));
        siteService.addSite(site);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteSite(@PathVariable ("id") int id) {
        Site site = new Site();
        site.setId(id);
        siteService.deleteSite(site);
    }
}
