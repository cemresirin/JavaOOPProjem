class Vehicle {
int speed;
}

class MyCar extends Vehicle {
}

public class Car3 {
public static void main (String[] args) {
MyCar myCar = new MyCar();
myCar.speed = 200;
System.out.println("Arabanın hızı: " + myCar.speed + " km/s");
}
}
