public class MethodOverloadingExample {
    public static void main (String[] args) {
        Calculator hesapMakinesi = new Calculator () ;

        int sonuc1 =hesapMakinesi.add(2, 8);
        int sonuc2 =hesapMakinesi.add(7,3, 4);

        System.out.println("İki sayının toplamı: " + sonuc1);
        System.out.println("Üç sayının toplamı: " + sonuc2);
    }
}
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

        int add ( int a, int b, int c) {
            return a + b + c;
        }
    }


