package dz19;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static dz19.FruitType.APPLE;
import static dz19.FruitType.ORANGE;
import static dz19.FruitType.PEAR;
import static dz19.FruitType.STRAWBERRY;

import static dz19.Vitamin.A;
import static dz19.Vitamin.B;
import static dz19.Vitamin.B1;
import static dz19.Vitamin.B2;
import static dz19.Vitamin.C;
import static dz19.Vitamin.D;
import static dz19.Vitamin.E;
import static dz19.Vitamin.P;


public class MainLambda {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();
        System.out.println("-------------1---------");
        fruits.stream().filter(fr -> fr.getVitamins().contains(A) || fr.getVitamins().contains(C)).forEach(System.out::println);
        System.out.println("-------------2---------");
        fruits.stream().map(Fruit::getVitamins).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("------------3----------");
        TreeMap<FruitType, Fruit> fruitMap = fruits.stream().collect(Collectors.toMap(Fruit::getFruitType, Function.identity(), getFruitBinaryOperator()
                , TreeMap::new));
        System.out.printf(String.valueOf(fruitMap));
        System.out.println("");
        System.out.println("------------4----------");
        fruits.stream().sorted(Comparator.comparingInt(Fruit::getDayToLive)).skip(fruits.size() - 3).forEach(System.out::println);
        System.out.println("------------5----------");
        System.out.println(fruits.stream().collect(Collectors.groupingBy(Fruit::getFruitType, Collectors.counting())));
        System.out.println("------------6----------");
        Map<FruitType, List<FruitType>> fruitMapSet = fruits.stream().collect(Collectors.groupingBy(Fruit::getFruitType,Collectors.mapping(Fruit::getFruitType,Collectors.toList())));
        System.out.println(fruitMapSet);

    }

    private static BinaryOperator<Fruit> getFruitBinaryOperator() {
        return (fruits1, fruits2) -> {
            if (fruits1.getPrice() > fruits2.getPrice()) {
                return fruits2;
            } else {
                return fruits1;
            }
        };
    }

    private static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 13, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }
}