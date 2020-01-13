package com.eheinen.comparablevscomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Camilo", "Oliveira", 88, 7.200),
            new Person("Camilo", "Oliveira", 87, 7.200),
            new Person("Camilo", "Oliveira", 87, 7.100),
            new Person("Camilo", "Oliveira", 87, 7.000),
            new Person("Eduardo", "Heinen", 21, 12.500),
            new Person("Paulo", "Heinen", 50, 25.400),
            new Person("Gabriel", "Santos", 33, 12.400),
            new Person("Amaro", "Silva", 13, 1000)
        );

        Collections.sort(people);

        people.forEach(System.out::println);

        // ----------------------------------------------------

        List<Car> cars = Arrays.asList(
            new Car("BMW", "Green", 56.700),
            new Car("BMW", "Blue", 55.700),
            new Car("BMW", "Blue", 33.223),
            new Car("Volkswagen", "Orange", 54.500),
            new Car("Audi", "Red", 53.900),
            new Car("Porsche", "White", 60.250)
        );

        System.out.println("Sorting by Brand: ");
        Comparator<Car> brandComparator = Comparator.comparing(Car::getBrand);
        cars.sort(brandComparator);
        cars.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Sorting by Color: ");
        Comparator<Car> colorComparator = Comparator.comparing(Car::getColor);
        cars.sort(colorComparator);
        cars.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Sorting by Price: ");
        Comparator<Car> priceComparator = Comparator.comparing(Car::getPrice);
        cars.sort(priceComparator);
        cars.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Sorting by Brand and Price: ");
        Comparator<Car> brandAndPriceComparator = Comparator.comparing(Car::getBrand).thenComparing(Car::getPrice);
        cars.sort(brandAndPriceComparator);
        cars.forEach(System.out::println);
        System.out.println("--------------------------------------");
    }
}
