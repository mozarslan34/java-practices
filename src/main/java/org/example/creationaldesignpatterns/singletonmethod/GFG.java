package org.example.creationaldesignpatterns.singletonmethod;

public class GFG {
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        Singleton s3 = Singleton.getInstance();

        Singleton s1 = Singleton.Singleton();
        Singleton s2 = Singleton.Singleton();
        Singleton s3 = Singleton.Singleton();

        System.out.println("Hashcode s1 :" + s1.hashCode());
        System.out.println("Hashcode s2 :" + s2.hashCode());
        System.out.println("Hashcode s3 :" + s3.hashCode());

        if (s1 == s2 && s2 == s3) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }

        s1.s = (s1.s).toUpperCase();

        System.out.println("String from x is " + s1.s);
        System.out.println("String from y is " + s2.s);
        System.out.println("String from z is " + s3.s);
        System.out.println("\n");

        s3.s = (s3.s).toLowerCase();

        System.out.println("String from x is " + s1.s);
        System.out.println("String from y is " + s2.s);
        System.out.println("String from z is " + s3.s);

    }
}
