package SS07_AbstractClass_Interface.Practice;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken said: Clock Clock";
    }

    @Override
    public String howToEat() {
        return "Could be bake";
    }
}
