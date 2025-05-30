class Car {

    String marka;
    String model;
    int yil;
}
public class Main {
    public static void main(String[] args) {

        Car araba = new Car();
        araba.marka = "Renault";
        araba.model = "Clio";
        araba.yil = 2025;

        System.out.println("Marka: " + araba.marka);
        System.out.println("Model: " + araba.model);
        System.out.println("Yıl: " + araba.yil);
    }
}
