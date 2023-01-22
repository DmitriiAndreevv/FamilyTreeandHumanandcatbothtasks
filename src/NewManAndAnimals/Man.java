package NewManAndAnimals;

public class Man implements ManHasToCallCat {

    public void FeedingDog(){
        System.out.println("Man feeding the dog");
        System.out.println("________________");
    }

    @Override
    public void CallingCat(){
        System.out.println("Murasaki,go to eat...");
        System.out.println("_________");
    }

    public void Feeding() {
        System.out.println("Man feeding the cat");
        System.out.println("___________");
    }
}
