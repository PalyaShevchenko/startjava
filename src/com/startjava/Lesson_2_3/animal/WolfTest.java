package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        String gender = "man";
        String nick = "Акелла";
        double weight = 58.5;
        int age = 9;
        wolf1.setGender(gender);
        wolf1.setNick(nick);
        wolf1.setWeight(weight);
        wolf1.setAge(age);
        wolf1.setColor("white");
        System.out.println("пол - " + wolf1.getGender());
        System.out.println("кличка - " + wolf1.getNick());
        System.out.println("вес - " + wolf1.getWeight() + " кг");
        System.out.println("возраст - " + wolf1.getAge() + " года(лет)");
        System.out.println("окрас - " + wolf1.getColor());
        wolf1.go();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}