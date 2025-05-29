public class Main {
    public static void main(String[] args) {

        Car araba = new Car("Renault","Clio", 2025 );

        System.out.println("Marka: " + araba.marka);
        System.out.println("Model: " + araba.model);
        System.out.println("Yıl: " + araba.yil);
    }
}
class Car {

    String marka;
    String model;
    int yil;

    Car(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
}