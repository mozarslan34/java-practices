package org.example.creationaldesignpatterns.singletonmethod;

class Singleton {
    private static Singleton instance = null;

    public String s;

    private Singleton() {
        s = "Hello World";
    }

//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public static Singleton Singleton()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
