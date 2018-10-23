package me.afua.completethis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

    @Autowired
    PersonService people;

    @RequestMapping("/")
    public String showPeople(Model model)
    {

        Person p = new Person("Someone","LastName","email@email.com");
        people.add(p);

        p = new Person();
        p.setFirstName("This is my first name");
        people.add(p);

        model.addAttribute("people",people);
        return "index";


    }
}
