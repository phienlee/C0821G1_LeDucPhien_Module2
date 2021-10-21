package _10_java_collection_framework.exercise.models;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int stock;
    private int price;

    public Product(int idProduct, String nameProduct, int stock, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.stock = stock;
        this.price = price;
    }

    public Product() {

    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
