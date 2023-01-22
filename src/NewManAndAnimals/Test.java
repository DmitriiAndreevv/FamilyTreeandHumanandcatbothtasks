package NewManAndAnimals;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Man man = new Man();
        Pets pets = new Pets() {
            @Override
            public void eat() {
                super.eat();
            }
        };
        dog.MakeSound();
        man.FeedingDog();
        dog.eat();

        man.CallingCat();
        cat.MakeSound();

        man.Feeding();
        cat.eat();

        pets.eat();
    }
}
