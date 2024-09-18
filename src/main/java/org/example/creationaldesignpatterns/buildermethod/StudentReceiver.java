package org.example.creationaldesignpatterns.buildermethod;

class StudentReceiver {

    private volatile Student student;

    public StudentReceiver() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                student =  Student.Builder.newInstance()
                        .setId(1)
                        .setName("Ram")
                        .setAddress("Noida")
                        .build();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                student = Student.Builder.newInstance()
                        .setId(2)
                        .setName("Shyam")
                        .setAddress("Delhi")
                        .build();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public Student getStudent() {
        return student;
    }
}
