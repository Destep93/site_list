package com.bonvio.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "service")
public class ServiceController {

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String getOne() {
        System.out.println("1");



        return "index";
    }


    @RequestMapping(value = "/2", method = RequestMethod.GET)
    public String getTwo() {
        System.out.println("2");




        return "index";
    }

}
