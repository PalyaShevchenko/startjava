public class Person {

    String gender = "men";
    String name = "Jeeves";
    int age = 37;
    double height = 1.90;
    double weight = 82.5;

    void move() {
        System.out.println("иду");
    }

    void sit() {
        System.out.println("сижу");
    }

    void run() {
        System.out.println("бегу");
    }

    String speak() {
        return "Текст";
    }

    String learnJava() {
        return "ответ на задание";
    }
}