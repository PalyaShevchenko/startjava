public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.gender = "man";
        wolf1.nick = "Акелла";
        wolf1.weight = 58.5;
        wolf1.age = 5;
        wolf1.color = "white";
        System.out.println("пол - " + wolf1.gender);
        System.out.println("кличка - " + wolf1.nick);
        System.out.println("вес - " + wolf1.weight + " кг");
        System.out.println("возраст - " + wolf1.age + " года(лет)");
        System.out.println("окрас - " + wolf1.color);
        wolf1.go();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}