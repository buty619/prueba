package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

  @Autowired
  private ProductRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataMongodbApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of products
    repository.save(new Product("Test1", "Category1", true, 2500, 50, "test.url"));
    repository.save(new Product("Test2", "Category2", true, 800, 32, "test.url"));
    repository.save(new Product("Test3", "Category3", true, 900, 20, "test.url"));
    repository.save(new Product("Test4", "Category4", true, 100, 10, "test.url"));
    repository.save(new Product("Test5", "Category1", true, 1000, 40, "test.url"));
    repository.save(new Product("Test6", "Category2", true, 35, 12, "test.url"));
    repository.save(new Product("Test7", "Category1", true, 60, 21, "test.url"));
    repository.save(new Product("Test8", "Category3", true, 61, 32, "test.url"));
    repository.save(new Product("Test9", "Category4", true, 500, 42, "test.url"));
    repository.save(new Product("Test10", "Category4", true, 600, 90, "test.url"));
    repository.save(new Product("Test11", "Category2", true, 700, 12, "test.url"));
    repository.save(new Product("Test12", "Category1", true, 800, 43, "test.url"));
    repository.save(new Product("Test13", "Category2", true, 1300, 60, "test.url"));
    repository.save(new Product("Test14", "Category1", true, 865, 10, "test.url"));
    repository.save(new Product("Test15", "Category3", true, 400, 52, "test.url"));
    repository.save(new Product("Test16", "Category4", true, 300, 45, "test.url"));
    repository.save(new Product("Test17", "Category1", true, 200, 40, "test.url"));
    repository.save(new Product("Test18", "Category4", true, 1560, 10, "test.url"));
    repository.save(new Product("Test19", "Category3", true, 1600, 12, "test.url"));
    repository.save(new Product("Test20", "Category3", true, 2500, 12, "test.url"));

    // fetch all producs
    System.out.println("Products found with findAll():");
    System.out.println("-------------------------------");
    for (Product product : repository.findAll()) {
      System.out.println(product);
    }
    System.out.println();

  }
}