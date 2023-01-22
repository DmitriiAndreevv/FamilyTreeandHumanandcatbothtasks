package NewManAndAnimals;

public class Cat implements HaveToMakeSound {
    @Override
    public void MakeSound(){
        System.out.println("meow");
        System.out.println("___________");
    }

    public void eat() {
        System.out.println("cat eating...");
        System.out.println("___________");
    }
}
