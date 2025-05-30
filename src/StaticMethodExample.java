public class StaticMethodExample {
    //statik metot
    public static int carp(int a, int b) {
        return a * b ;
    }
public static void main (String[] args) {
        int sonuc = carp(7, 8);
        System.out.println("Çarpım sonucu: " + sonuc);
    }
}