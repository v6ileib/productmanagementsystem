package org.sms.productmanagementsystem.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller()
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //list all products
    @GetMapping("/products")
    public String displayAllProductsPage() {
        return "products/all";
    }

    @GetMapping("/products/add")
    public String displayAddProductPage() {
        return "products/add";
    }

    @PostMapping("/products/add")
    public String createProduct(Product product) {
        System.out.println(product);
        try {
            this.productService.createProduct(product);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println(product);
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{Id}")
    public String displayEditProductPage() {
        return "redirect:/products";
    }

    @PostMapping("/products/edit/{Id}")
    public String editProduct(Product product) {

        return "redirect:/products";
    }

    @PostMapping("/products/delete/{Id}")
    public String deleteProduct(Product product) {
        return "redirect:/products";
    }

}

