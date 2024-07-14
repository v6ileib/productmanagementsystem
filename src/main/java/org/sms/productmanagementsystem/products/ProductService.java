package org.sms.productmanagementsystem.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void createProduct(Product product) throws Exception {
        this.productRepository.save(product);
    }
}
