package _10_java_collection_framework.exercise.sevices;

import _10_java_collection_framework.exercise.models.Product;

import java.util.List;

public interface IProductService {

    void addProduct(Product product);

    void editProduct(int idProduct , Product product);

    List<Product> getProductList();

    void deleteProduct(int idProduct);

    Product findProduct(String nameProduct);

    void sortProductList();

    Product findByIdProduct(int idProduct);

}
