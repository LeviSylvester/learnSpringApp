package animalInheritance;

public class Shelter {
    public static void main(String[] args) {
        Cat mini = new Cat();
        Dog maxi = new Dog();

        mini.heartBeat();
        mini.meouws();

        maxi.heartBeat();
        maxi.barks();
    }
}
