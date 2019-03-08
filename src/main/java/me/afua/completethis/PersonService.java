package me.afua.completethis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PersonService {
    private Set<Person> list;

    @Autowired
    public PersonService() {
        list = new HashSet<>();

    }

    public Set<Person> getList() {
        return list;
    }

    public void setList(Set<Person> list) {
        this.list = list;
    }

    public void add(Person p) {
        list.add(p);
    }
}
