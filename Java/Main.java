package Java;

class Main {
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Andrés Herrera", "AND123000"));

        // car.license = "AMQ123";
        // car.driver = "Andrés Herrera";
        car.passengers = 4;

        // System.out.println("Car licence: " + car.license);
        car.printCarData();

        Car car2 = new Car("QWE567", new Account("Juana Herrera", "JUA456000"));

        // car2.license = "QWE567";
        // car2.driver = "Juana Herrera";
        car2.passengers = 3;

        // System.out.println("Car license: " + car2.license);
        car2.printCarData();
    }
}