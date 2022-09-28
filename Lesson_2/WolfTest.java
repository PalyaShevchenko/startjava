public class WolfTest {
    
    public static void main (String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "man";
        wolfOne.nick = "Акелла";
        wolfOne.weight = 58.5;
        wolfOne.age = 5;
        wolfOne.color = "white";
        System.out.println("пол - " + wolfOne.gender);
        System.out.println("кличка - " + wolfOne.nick);
        System.out.println("вес - " + wolfOne.weight + " кг");
        System.out.println("возраст - " + wolfOne.age + " года(лет)");
        System.out.println("окрас - " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}