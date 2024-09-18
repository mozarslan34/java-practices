package org.example.creationaldesignpatterns.buildermethod;

public class BuilderDemo {
    public static void main(String[] args) {
        StudentReceiver sr = new StudentReceiver();
        System.out.println(sr.getStudent());

        Student s1 = Student.Builder.newInstance()
                .setId(1)
                .setName("ahmet")
                .setAddress("ist")
                .build();

        Student s2 = Student.Builder.newInstance()
                .setId(2)
                .setName("mehmet")
                .setAddress("gebze")
                .build();
        System.out.println("s1: " + s1 +"\ns2: " + s2);
    }
}
