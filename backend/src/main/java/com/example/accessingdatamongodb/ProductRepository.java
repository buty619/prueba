package com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "product", path = "product")
@CrossOrigin(origins = "*")
public interface ProductRepository extends MongoRepository<Product, String> {

  public List<Product> findByProductName(@Param("name") String productName);

  Product findProductById(String productId);

}