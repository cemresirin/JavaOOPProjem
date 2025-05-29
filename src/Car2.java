import javax.management.modelmbean.ModelMBean;

public class Car2 {
    private String brand ;
    private String model ;
    private int year ;

    //getter
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //setter

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
Car2 araba = new Car2();

araba.setBrand("Renault");
araba.setModel("Clio");
araba.setYear(2025);

System.out.println("Marka: "+ araba.getBrand());
System.out.println("Model: "+ araba.getModel());
System.out.println("Year: "+ araba.getYear());
    }
}






