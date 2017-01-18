package com.bonvio.mvc;

import com.bonvio.model.People;
import com.bonvio.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author dmitriy
 */
@Controller
@RequestMapping(value = "people")
public class PeopleController {
    
    @Autowired
    PeopleService peopleService;
    
    @RequestMapping(value = "get" ,method = RequestMethod.GET)
    @ResponseBody
    public Object getPeople() {
        return peopleService.get();
    }
    
    @RequestMapping(value = "getSites/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Object getSites(@PathVariable ("id") long people_id) {
        return peopleService.getSitesByPeopleId(people_id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.CREATED)
    public void addPeople(@RequestBody People people) {
        peopleService.add(people);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePeople(@PathVariable ("id") long people_id) {
        People people = new People();
        people.setPeople_id(people_id);
        peopleService.delete(people);
    }
}
