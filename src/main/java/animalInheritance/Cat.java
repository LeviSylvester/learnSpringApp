package animalInheritance;

public class Cat extends LifeFunctionsImpl implements CatFunctions {
    @Override
    public void meouws() {
        System.out.println("Meouw!");
    }
}
