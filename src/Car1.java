public class Car1 {
    String marka;
    String model;
    int yil;

    //constructor
    Car1(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public static void main(String[] args) {
        Car1 araba = new Car1("Renault", "Clio", 2025);

    }
}
