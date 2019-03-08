package me.afua.completethis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    PersonService people;

    @RequestMapping("/")
    public String showPeople(Model model) {
        model.addAttribute("people", people.getList());
        return "index";
    }

    @RequestMapping("/addperson")
    public String addPerson(Model model) {
        model.addAttribute("personObject", new Person());
        return "addperson";
    }


    @RequestMapping("/saveperson")
    public String savePerson(@ModelAttribute("personObject") Person toSave) {
        System.out.println(toSave);
        people.add(toSave);
        return "redirect:/";
    }


}
