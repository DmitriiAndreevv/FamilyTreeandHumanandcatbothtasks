package HumanAndCat;

public class Interaction {
    private String name;
    void speak() {
        System.out.println("кис-кис");    }
    String getName() {
        return this.name;    }
}
class Man extends Interaction {    @Override
void speak() {        System.out.println("мяу");
}}
class Talk {
    public static void main(String[] args) {
        Man cat = new Man();
        Interaction man = new Interaction();
        man.speak();
        cat.speak();
    }
}
