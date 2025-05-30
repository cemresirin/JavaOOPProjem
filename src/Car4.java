class Vehiclee {
   public void start() {
        System.out.println("Araç çalıştırılıyor " )  ;
    }
}
class CarX extends Vehiclee {
@Override
public void start() {
System.out.println("Araç harekete hazır. " ) ;
}
}

public class Car4 {
    public static void main(String[] args) {
CarX myCar=new CarX() ;
myCar.start();
}
}
