package _10_java_collection_framework.exercise.sevices;

import _10_java_collection_framework.exercise.models.Product;
import _10_java_collection_framework.exercise.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public void editProduct(int idProduct, Product product) {
        List<Product> productList = productRepository.getAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct()==idProduct){
                productList.set(i, product);
            }
        }
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.getAll();
    }

    @Override
    public void deleteProduct(int idProduct) {
        List<Product> productList = productRepository.getAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getIdProduct() == idProduct){
                productList.remove(i);
            }
        }
    }

    @Override
    public Product findProduct(String nameProduct) {
        Product product = null;
        List<Product> productList = productRepository.getAll();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().equals(nameProduct)){
               product = productList.get(i);
            }
        }
        return product;
    }

    @Override
    public void sortProductList() {

    }

    @Override
    public Product findByIdProduct(int idProduct) {
        return productRepository.findByIdProduct(idProduct);
    }


}
