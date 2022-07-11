package SS07_AbstractClass_Interface.Practice;

public class Apple extends Fruit implements Edible{
    @Override
    public String howToEat() {
        return "Could be bake";
    }
}
