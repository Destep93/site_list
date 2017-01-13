package com.bonvio.mvc;

import com.bonvio.model.People;
import com.bonvio.service.PeopleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "service")
public class ServiceController {
    
    @Autowired
    PeopleService peopleService;
    
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public void getOne() {
        peopleService.add(new People("slava", "streat12", 14));
    }


    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public void getTwo() {
        List<People> peoples = peopleService.get();
        for (People people : peoples) {
            System.out.println(people);
        }
    }

}
