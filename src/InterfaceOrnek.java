interface Hayvan {
    void sound();
}
class Kedi implements Hayvan {
    @Override
    public void sound() {
        System.out.println("Miyav");
    }
}
class Kopek implements Hayvan {
    @Override
    public void sound() {
        System.out.println("Hav hav");
    }
}
class InterfaceOrnek {
    public static void main (String[] args) {
        Hayvan kedi = new Kedi();
        Hayvan kopek = new Kopek();

        kedi.sound();
        kopek.sound();
        }
    }
