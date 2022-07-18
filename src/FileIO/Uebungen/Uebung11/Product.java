package FileIO.Uebungen.Uebung11;

public class Product {
    String productName;
    double price;
    String productCategory;

    public Product(String productName, double price, String productCategory) {
        this.productName = productName;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product: " +
                "Name: " + productName + '\'' +
                " price: " + price +
                " productCategory: " + productCategory + '\'';
    }
}
