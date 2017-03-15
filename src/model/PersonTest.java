package model;

import app.Person;

/**
 * Created by Helmut on 2017-03-15.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("Jan");
        person[1] = new Person("Krzysztof");
        person[2] = new Person("Anna");

        //person.
        System.out.println(person[0].getName());
        System.out.println(person[1].getName());
        System.out.println(person[2].getName());
    }
}
