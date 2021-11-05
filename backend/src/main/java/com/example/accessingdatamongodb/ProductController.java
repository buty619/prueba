package com.example.accessingdatamongodb;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {
    private Logger logger =
    LoggerFactory.getLogger(AccessingDataMongodbApplication.class);
    @Autowired
    private ProductRepository repository;

    @GetMapping(value = "/")
    public List<Product> getProduct() {
        logger.info("Getting all products.");
        return repository.findAll();
    }

    @GetMapping(value = "/{productId}")
    public Product getProductById(@PathVariable String productId) {
        logger.info("Getting product with ID: {}", productId);
        return repository.findProductById(productId);
    }

    @PostMapping(value = "/create")
    public List<Product> addProduct(@RequestBody Product product) {
        logger.info("Saving product: {}", product);
        repository.save(product);
        return repository.findAll();
    }

    @PutMapping(value = "/update/{productId}")
    public Product updateProduct(@PathVariable String productId, @RequestBody Product product) {
        logger.info("Updating product with ID: {}", productId);
        return repository.save(product);
    }

    @DeleteMapping(value = "/delete/{productId}")
    public List<Product> deleteProduct(@PathVariable String productId) {
        logger.info("Deleting product with ID: {}", productId);
        repository.deleteById(productId);
        return repository.findAll();
    }
}