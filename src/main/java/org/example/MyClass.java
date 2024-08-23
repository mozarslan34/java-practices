package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Mertcan Özarslan
 */

public class MyClass {
    public static class Person implements Comparable<Person> {
        private Integer age;
        private String name;
        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            return o.age - this.age;
        }

        @Override
        public String toString() {
            return "Person : İsim "+ name + "Yaş :"+ age;
        }
    }
    public static void main(String args[]) {
        List<Person> li = new ArrayList<Person>();
        li.add(new Person("Ali", 35));
        li.add(new Person("Veli", 25));
        li.add(new Person("Hasan", 27));
        Collections.sort(li);
        for(Person p : li) {
            System.out.println(p.toString());
        }
    }
}


public class MyClass {
    private class Person {
        private Integer age;
        private String name;
        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String args[]) {
        List<Person> li = new ArrayList<Person>();
        li.add(new Person("Ali", 35));
        li.add(new Person("Veli", 25));
        li.add(new Person("Hasan", 27));
        Collections.sort(li);
        for(Person p : li) {
            System.out.println(p.toString());
        }
    }
}
