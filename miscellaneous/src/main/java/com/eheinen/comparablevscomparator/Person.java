package com.eheinen.comparablevscomparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {

    private String firstName;

    private String lastName;

    private int age;

    private double salary;

    @Override
    public int compareTo(Person otherPerson) {
        int i = this.firstName.compareTo(otherPerson.firstName);

        if (i != 0) {
            return i;
        }

        i = this.lastName.compareTo(otherPerson.lastName);

        if (i != 0) {
            return i;
        }

        if (this.age > otherPerson.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
