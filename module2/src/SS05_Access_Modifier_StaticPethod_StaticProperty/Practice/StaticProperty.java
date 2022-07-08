package SS05_Access_Modifier_StaticPethod_StaticProperty.Practice;

public class StaticProperty {
    public static class Car {
        private String name;
        private String engine;

        public static int numberOfCar;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCar++;
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("HondaSpeed", "civis2019");
        System.out.println(Car.numberOfCar + car1.name + car1.engine);


        Car car2 = new Car("HondaSpeed", "civis2022");
        System.out.println(Car.numberOfCar);
    }
}
