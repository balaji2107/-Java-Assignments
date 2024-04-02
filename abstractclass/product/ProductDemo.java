package abstractclass.product;

abstract class Product{
    String productName;
    String color;
    String brand;

    public Product(String product,String brand,String color){
        productName=product;
        this.brand=brand;
        this.color=color;
    }
    public abstract double getPrice();
    public abstract String getDescription();

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", Price='" + getPrice() + '\'' +
                ", Description='" + getDescription() + '\'' +
                '}';
    }
}
class ElectronicsProduct extends Product{
    double price;
    float starRating;
    public ElectronicsProduct(String productName,String brand,String color,double price,float starRating){
        super(productName,brand,color);
        this.price=price;
        this.starRating=starRating;
    }
    @Override
    public double getPrice() {
        return 0.5*price;
    }
    @Override
    public String getDescription() {
        return " (Rating: " + starRating + ")";
    }
}
class ClothingProduct extends Product{
    double price;
    int size;
    public ClothingProduct(String productName,String brand,String color,double price,int size){
        super(productName,brand,color);
        this.price=price;
        this.size=size;
    }
    @Override
    public double getPrice() {
        return 1.2*price;
    }
    @Override
    public String getDescription() {
        return " (Size: " + size + ")";
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        Product eProduct=new ElectronicsProduct("Laptop","hp","white",5000,4.5f);
        Product cProduct=new ClothingProduct("Shirt","Petter England","black",1500,30);
        System.out.println(eProduct);
        System.out.println(cProduct);
    }
}
