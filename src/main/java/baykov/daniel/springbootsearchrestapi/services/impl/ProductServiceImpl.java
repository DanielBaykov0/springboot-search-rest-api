package baykov.daniel.springbootsearchrestapi.services.impl;

import baykov.daniel.springbootsearchrestapi.entities.Product;
import baykov.daniel.springbootsearchrestapi.repositories.ProductRepository;
import baykov.daniel.springbootsearchrestapi.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProductsSQL(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
