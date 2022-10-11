package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    
    public static void main (String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Avenger");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setKaijuKilled(1);
        System.out.println("Имя робота: " + jaegerOne.getModelName());
        System.out.println("Марка робота: " + jaegerOne.getMark());
        System.out.println("Число уничтоженных Кайдзю: " + jaegerOne.getKaijuKilled());
        System.out.println("поиск Кайдзю: " + jaegerOne.scanKaiju() +"\n");
        System.out.println("Вооружение к бою");
        jaegerOne.useVortexCannon();
        System.out.println("\nКайдзю уничтожен\n");
        jaegerOne.setKaijuKilled(jaegerOne.getKaijuKilled() + 1);
        System.out.println("Имя робота: " + jaegerOne.getModelName());
        System.out.println("Число уничтоженных Кайдзю: " + jaegerOne.getKaijuKilled() + "\n");

        Jaeger jaegerTwo = new Jaeger("Cherno Alpha","Mark-1",6);
        System.out.println("Имя робота: " + jaegerTwo.getModelName());
        System.out.println("Марка робота: " + jaegerTwo.getMark());
        System.out.println("Число уничтоженных Кайдзю: " + jaegerTwo.getKaijuKilled());
        jaegerTwo.move();
    }
}