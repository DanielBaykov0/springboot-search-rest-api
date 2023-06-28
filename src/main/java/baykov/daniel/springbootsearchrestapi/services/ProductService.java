package baykov.daniel.springbootsearchrestapi.services;

import baykov.daniel.springbootsearchrestapi.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);

}
