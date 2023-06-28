package baykov.daniel.springbootsearchrestapi.repositories;

import baykov.daniel.springbootsearchrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
