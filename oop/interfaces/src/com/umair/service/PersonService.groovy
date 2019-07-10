package com.umair.service

import com.umair.domain.Person

class PersonService implements IPersonService{
    @Override
    Person find() {
        Person p = new Person(first: "Umair", last: "Arshad")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: "Umair", last: "Arshad")
        Person p2 = new Person(first: "Umar", last: "Haider")
        [p1,p2]
    }
}
