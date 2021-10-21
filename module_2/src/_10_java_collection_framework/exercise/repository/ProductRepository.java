package _10_java_collection_framework.exercise.repository;

import _10_java_collection_framework.exercise.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public static List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(1, "Iphone 5", 5, 200),
            new Product(2, "Iphone 6", 10, 500),
            new Product(3, "Iphone 7", 7, 1000),
            new Product(4, "Iphone 11 pro ", 20, 2000),
            new Product(5, "Iphone 12  ", 11, 2500)
    ));

    public void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getAll(){
        return productList;
    }

    public Product findByIdProduct(int idProduct){
        Product product =null;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct()== idProduct){
                product = productList.get(i);
            }
        }
        return product;
    }
}
