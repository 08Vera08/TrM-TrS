package com.company;

import PersonComparator.PersonComparator;

import java.util.Collections;
import java.util.LinkedList;

class Main {

    public static void main(String[] args) {
        PersonComparator comp = new PersonComparator();
        LinkedList<com.company.Person> list = new LinkedList<com.company.Person>();
        list.add(new com.company.Person("James", "Van Dam", 5));
        list.add(new com.company.Person("Hretta", "Tunberg", 12));
        list.add(new com.company.Person("Mohamed", "Petrov Egorov", 12));
        list.add(new com.company.Person("John", "Murtazaliev", 7));
        list.add(new com.company.Person("Jesus", "Pavlov", 8));
        list.add(new com.company.Person("Rotor", "Pavlov", 4));
        Collections.sort(list, comp);
        System.out.println(list);
    }

}