abstract class Shape {
    public abstract void draw();  //gövdesiz
}
class Circle extends Shape {
    @Override
    public void draw() {
    System.out.println("Çember çiziliyor");
}
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Dikdörtgen çiziliyor");
    }
}
 class Sekiller {
 public static void main (String[] args) {
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    circle.draw() ;
    rectangle.draw() ;
}
}