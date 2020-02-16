package animalInheritance;

public class Dog extends LifeFunctionsImpl implements DogFunctions {
    @Override
    public void barks() {
        System.out.println("Wof-wof!");
    }
}
