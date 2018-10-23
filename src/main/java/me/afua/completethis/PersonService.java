package me.afua.completethis;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {
    private ArrayList<Person> list;

    public ArrayList<Person> getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }

    public PersonService() {
        list = new ArrayList<>();

    }

    public void add(Person p)
    {
        list.add(p);
    }
}
